package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EVENT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_VENDOR;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_VENDORS;

import seedu.address.model.Model;
import seedu.address.ui.UiState;

/**
 * Displays multiview of vendor and event lists to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_MULTIVIEW_SUCCESS = "Multiview shown successfully";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays list of events, vendors or both.\n"
            + "Parameters: " + PREFIX_VENDOR + "<empty> or " + PREFIX_EVENT + "<empty>" + "\n"
            + "To list vendors: " + COMMAND_WORD + " " + PREFIX_VENDOR + "\n"
            + "To list events: " + COMMAND_WORD + " " + PREFIX_EVENT + "\n"
            + "To list both in multiview: " + COMMAND_WORD;

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setUiState(UiState.DEFAULT);
        model.updateFilteredVendorList(PREDICATE_SHOW_ALL_VENDORS);
        return new CommandResult(MESSAGE_MULTIVIEW_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof ListCommand);
    }
}
