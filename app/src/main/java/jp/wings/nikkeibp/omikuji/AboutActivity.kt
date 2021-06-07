package jp.wings.nikkeibp.omikuji

import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.TaskStackBuilder
import kotlinx.android.synthetic.main.about.*

class AboutActivity: AppCompatActivity(){
    override fun onCreateSupportNavigateUpTaskStack(builder: TaskStackBuilder) {
        super.onCreateSupportNavigateUpTaskStack(builder)

        setContentView(R.layout.about)

        val info = packageManager.getPackageInfo(packageName,0)
        textView2.text = "Version " + info.versionName
    }
}