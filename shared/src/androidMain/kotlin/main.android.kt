import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import presentation.reminder.ReminderScreenContent
import presentation.settings.SettingsScreenContent

@Composable fun MainView() = App()

@Preview
@Composable
private fun ReminderScreenPreview() {
    ReminderScreenContent(onEvent = {})
}

@Preview
@Composable
private fun SettingsScreenPreview() {
    SettingsScreenContent(
        onEvent = {},
        weight = "63"
    )
}