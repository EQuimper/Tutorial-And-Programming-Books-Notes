// What is the side effects here ?

public class UserValidator {
  private Cryptographer cryptographer;

  public boolean checkPassword(String username, String password) {
    User user = UserGateway.findByName(username);
    if (user != User.NULL) {
      String codedPhrase = user.getPhraseEncodedByPassword();
      String phrase = cryptographer.decrypt(codedPhrase, password);
      if ("Valid Password".equals(phrase)) {
        Session.initialize();
        return true;
      }
    }
    return false;
  }
}

// Response: Session.initialize();
// Another programmer who gonna use this function gonna think he only
// Check the password, but he finish with also a session initialize. If want to use it this way, maybe change
// the name of the function for `checkPasswordAndInitializeSession` but that would violate
// the one thing function