package interface_adapter.clear_users;

// TODO Complete me

public class ClearViewModel {
    private String statusMessage;  // Message to display the result of the clear operation
    private boolean isClearButtonEnabled;  // Enable or disable the Clear button based on certain conditions

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public boolean isClearButtonEnabled() {
        return isClearButtonEnabled;
    }

    public void setClearButtonEnabled(boolean clearButtonEnabled) {
        isClearButtonEnabled = clearButtonEnabled;
    }
}