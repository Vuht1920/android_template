package com.solid.navigation.navigator

import android.net.Uri
import androidx.navigation.NavController
import com.solid.navigation.destination.Destination

fun Destination.withArguments(arguments: Map<String, Any?>): String {
    val uri = Uri.parse(route)
    val newUri = Uri.Builder()
        .scheme("https")
        .authority(uri.authority)
        .apply {
            uri.pathSegments.forEach {
                appendPath(it)
            }
        }
        .apply {
            arguments.forEach {
                appendQueryParameter(it.key, "${it.value}")
            }
        }
        .build()
    return Uri.decode(newUri.toString())
}

fun NavController.navigateTo(destination: Destination, arguments: Map<String, Any?> = emptyMap()) {
    navigate(
        route = destination.withArguments(arguments)
    )
}