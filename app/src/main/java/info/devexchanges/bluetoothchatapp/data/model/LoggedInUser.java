package info.devexchanges.bluetoothchatapp.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String displayName;
    private String interest;

    public LoggedInUser(String userId, String displayName, String interest) {
        this.userId = userId;
        this.displayName = displayName;
        this.interest = interest;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getInterest() {
        return interest;
    }
}
