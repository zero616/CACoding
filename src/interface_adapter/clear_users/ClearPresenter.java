package interface_adapter.clear_users;

// TODO Complete me


public class ClearPresenter {
    private ClearState state;
    private ClearViewModel viewModel;

    public ClearPresenter(ClearState state, ClearViewModel viewModel) {
        this.state = state;
        this.viewModel = viewModel;
    }
    public void updateViewModel() {
        if (state.isClearedSuccessfully()) {
            viewModel.setStatusMessage("Users cleared successfully");
            viewModel.setClearButtonEnabled(true);
        } else {
            viewModel.setStatusMessage("Failed to clear users. Please try again.");
            viewModel.setClearButtonEnabled(true); // You can control whether to enable the button based on the actual logic.
        }
    }
}