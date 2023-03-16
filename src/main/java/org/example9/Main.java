package org.example9;
import java.sql.*;

public class Main {
    public static void main(String[] args){
        //STEP0 事前準備（JAR配置を含む）
        try{
            Class.forName("org.h2.Driver");
        }catch (ClassNotFoundException e) {
            //throw new IllegalArgumentException("ドライバのロードに失敗");
            throw new IllegalStateException("ドライバのロードに失敗");

        }

        Connection con = null;
        try{
            //ステップ1　DBへの接続
            con = DriverManager.getConnection("jbdc:mysql:sample");
            con.setAutoCommit(false); //手動コミットモードに切り替え
            //ステップ2　DB操作処理

            //ステップ2-1-1 送信すべきSQL文のひた形を準備
            PreparedStatement pstmt = con.prepareStatement(
                    "DELETE FROM MONSTERS WHERE HP<=? OR NAME = ?"
            );
            //ステップ2-1-2 ひな形に値を流し込みSQL文を組み立てる
            pstmt.setInt(1,10);
            pstmt.setString(2,"ゾンビ");

            //ステップ2-1-3 組み立て終えたSQL文をDBMSに送信する
            int r = pstmt.executeUpdate();

            //ステップ2-1-4 処理結果の判定
            if(r!= 0){
                System.out.println(r+"件のデータが削除された");
            }else{
                System.out.println("該当するデータはありませんでした");
            }
            pstmt.close();

            con.commit(); //コミット

        }catch (SQLException e){
            //e.printStackTrace();
            try{
                con.rollback(); //ロールバック
            }catch (SQLException e2){
                e2.printStackTrace(); //接続やSQL失敗時の処理
            }

        }finally {
            //STEP3：DB接続の切断
            if(con != null){
                try{
                    con.close();
                }catch (SQLException e3){
                    //エラーに応じたエラー処理を記載
                    e3.printStackTrace();
                }
            }
        }
    }
}
