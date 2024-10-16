package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_VENDORS;

import seedu.address.model.Model;
import seedu.address.ui.UiState;

/**
 * Lists all vendors in the address book to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_SUCCESS = "Listed all vendors";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setUiState(UiState.DEFAULT);
        model.updateFilteredVendorList(PREDICATE_SHOW_ALL_VENDORS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
