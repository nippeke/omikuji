package jp.wings.nikkeibp.omikuji

import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import java.util.*


class OmikujiBox: Animation.AnimationListener {
    lateinit var omikujiView : ImageView
    var finish = false //箱から出たか？
    val number : Int  //くじ番号(0~19の乱数)
    get() {
        var rnd = Random()
        return rnd.nextInt(20)
    }

    fun shake() {
        //ウィジェットの移動
        val translate = TranslateAnimation(0f,0f,0f,-200f)
        //繰り返しモード
        translate.repeatMode = Animation.REVERSE
        //繰り返し回数
        translate.repeatCount = 5
        //アニメーション時間
        translate.duration = 100
        //アニメーション回転
        val rotate = RotateAnimation(0f, 36f, omikujiView.width/2f, omikujiView.height/2f)
        rotate.duration = 200
        //AnimationSetクラスを使ってアニメーションの合成
        val set = AnimationSet(true)
        set.addAnimation(rotate)
        set.addAnimation(translate)

        set.setAnimationListener(this)

        omikujiView.startAnimation(set)

        finish = true

    }

    //アニメーションが開始されるメソッド
    override fun onAnimationStart(animation: Animation?) {
    }

    //アニメーションが終了するメソッド
    override fun onAnimationEnd(animation: Animation?) {
        omikujiView.setImageResource(R.drawable.omikuji1)
    }

    //アニメーションが繰り返されるメソッド
    override fun onAnimationRepeat(animation: Animation?) {
    }
}