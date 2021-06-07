package jp.wings.nikkeibp.omikuji

import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.TaskStackBuilder


class OmikujiPreferenceActivity:AppCompatActivity() {
    override fun onCreateSupportNavigateUpTaskStack(builder: TaskStackBuilder) {
        super.onCreateSupportNavigateUpTaskStack(builder)
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(android.R.id.content,OmikujiPreferenceFragment())
        fragmentTransaction.commit()
    }
}