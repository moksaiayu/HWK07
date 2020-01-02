package bluenet.com.lab15

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyMessagingService : FirebaseMessagingService(){
    companion object {const val TAG = "MessagingService"}
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.e(TAG, "onNewToken  $token")}
    override fun onMessageReceived(msg: RemoteMessage) {
        super.onMessageReceived(msg)
        Log.e(TAG, msg.from ?: "")
        for(entry in msg.data.entries)
            Log.e("message","${entry.key}/${entry.value}")}}