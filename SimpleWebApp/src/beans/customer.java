package beans;

public class customer {
 public static final String GENDER_MALE="M";
 public static final String GENDER_FEMALE="F";
 private String USER_NAME;
 private String GENDER;
 private String PASSWORD;
 
 public customer(){}
 
 public String getUserName() {
     return USER_NAME;
 }
 public void setUserName(String userName) {
     this.USER_NAME = userName;
 }
 public String getGender() {
     return GENDER;
 }

 public void setGender(String gender) {
     this.GENDER = gender;
 }

 public String getPassword() {
     return PASSWORD;
 }

 public void setPassword(String password) {
     this.PASSWORD = password;
 }
}
