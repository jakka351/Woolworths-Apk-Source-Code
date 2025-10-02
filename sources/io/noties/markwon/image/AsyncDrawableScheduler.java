package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.woolworths.R;

/* loaded from: classes7.dex */
public abstract class AsyncDrawableScheduler {

    public static class DrawableCallbackImpl implements Drawable.Callback {
        public final TextView d;
        public final TextViewInvalidator e;
        public Rect f;

        public interface Invalidator {
        }

        public DrawableCallbackImpl(TextView textView, TextViewInvalidator textViewInvalidator, Rect rect) {
            this.d = textView;
            this.e = textViewInvalidator;
            this.f = new Rect(rect);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(final Drawable drawable) {
            Looper looperMyLooper = Looper.myLooper();
            Looper mainLooper = Looper.getMainLooper();
            TextView textView = this.d;
            if (looperMyLooper != mainLooper) {
                textView.post(new Runnable() { // from class: io.noties.markwon.image.AsyncDrawableScheduler.DrawableCallbackImpl.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrawableCallbackImpl.this.invalidateDrawable(drawable);
                    }
                });
                return;
            }
            Rect bounds = drawable.getBounds();
            if (this.f.equals(bounds)) {
                textView.postInvalidate();
                return;
            }
            TextViewInvalidator textViewInvalidator = this.e;
            TextView textView2 = textViewInvalidator.d;
            textView2.removeCallbacks(textViewInvalidator);
            textView2.post(textViewInvalidator);
            this.f = new Rect(bounds);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.d.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.d.removeCallbacks(runnable);
        }
    }

    public static class TextViewInvalidator implements DrawableCallbackImpl.Invalidator, Runnable {
        public final TextView d;

        public TextViewInvalidator(TextView textView) {
            this.d = textView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextView textView = this.d;
            textView.setText(textView.getText());
        }
    }

    public static AsyncDrawableSpan[] a(TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (AsyncDrawableSpan[]) ((Spanned) text).getSpans(0, length, AsyncDrawableSpan.class);
    }

    public static void b(final TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode);
        int iHashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            textView.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, Integer.valueOf(iHashCode));
            AsyncDrawableSpan[] asyncDrawableSpanArrA = a(textView);
            if (asyncDrawableSpanArrA == null || asyncDrawableSpanArrA.length <= 0) {
                return;
            }
            if (textView.getTag(R.id.markwon_drawables_scheduler) == null) {
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: io.noties.markwon.image.AsyncDrawableScheduler.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        AsyncDrawableScheduler.c(textView);
                        view.removeOnAttachStateChangeListener(this);
                        view.setTag(R.id.markwon_drawables_scheduler, null);
                    }
                };
                textView.addOnAttachStateChangeListener(onAttachStateChangeListener);
                textView.setTag(R.id.markwon_drawables_scheduler, onAttachStateChangeListener);
            }
            TextViewInvalidator textViewInvalidator = new TextViewInvalidator(textView);
            for (AsyncDrawableSpan asyncDrawableSpan : asyncDrawableSpanArrA) {
                AsyncDrawable asyncDrawable = asyncDrawableSpan.e;
                asyncDrawable.c(new DrawableCallbackImpl(textView, textViewInvalidator, asyncDrawable.getBounds()));
            }
        }
    }

    public static void c(TextView textView) {
        if (textView.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode) == null) {
            return;
        }
        textView.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, null);
        AsyncDrawableSpan[] asyncDrawableSpanArrA = a(textView);
        if (asyncDrawableSpanArrA == null || asyncDrawableSpanArrA.length <= 0) {
            return;
        }
        for (AsyncDrawableSpan asyncDrawableSpan : asyncDrawableSpanArrA) {
            asyncDrawableSpan.e.c(null);
        }
    }
}
