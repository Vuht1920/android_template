package deps

object Compose : Dependency() {
    object Versions {
        const val composeCompiler = "1.5.3"
        const val compose = "1.4.0-beta01"
        const val navigation = "2.5.0-alpha03"
        const val hiltNavigation = "1.1.0-alpha01"
        const val constraintLayout = "1.1.0-alpha13"
        const val activity = "1.8.0"
        const val accompanistPager = "0.33.2-alpha"
        const val accompanistPermission = "0.33.2-alpha"
        const val accompanistSwipeRefresh = "0.33.2-alpha"
        const val liveData = "1.4.0-beta02"
        const val material3 = "1.2.0-alpha09"
        const val googleFont = "1.3.2"
    }

    private const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    private const val material = "androidx.compose.material3:material3:${Versions.material3}"
    private const val uiPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    private const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    private const val debugUi = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    private const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    private const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    private const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigation}"
    private const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:${Versions.constraintLayout}"
    private const val materialIcon = "androidx.compose.material:material-icons-extended:${Versions.compose}"
    private const val activity = "androidx.activity:activity-compose:${Versions.activity}"
    private const val accompanistPager = "com.google.accompanist:accompanist-pager:${Versions.accompanistPager}"
    private const val accompanistPermission = "com.google.accompanist:accompanist-permissions:${Versions.accompanistPermission}"
    private const val accompanistSwipeRefresh = "com.google.accompanist:accompanist-swiperefresh:${Versions.accompanistSwipeRefresh}"
    private const val liveData = "androidx.compose.runtime:runtime-livedata:${Versions.liveData}"
    private const val googleFont = "androidx.compose.ui:ui-text-google-fonts:${Versions.googleFont}"

    override fun implementations() = listOf<String>(
        ui,
        material,
        uiPreview,
        runtime,
        navigation,
        hiltNavigation,
        constraintLayout,
        materialIcon,
        activity,
        accompanistPager,
        accompanistPermission,
        accompanistSwipeRefresh,
        googleFont
    )

    override fun debugImplementations() = listOf<String>(
        debugUi
    )
}