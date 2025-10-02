package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@RequiresApi
/* loaded from: classes4.dex */
final class FirstFrameWaiter implements FrameWaiter {

    /* renamed from: a, reason: collision with root package name */
    public final Set f13951a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // com.bumptech.glide.manager.FrameWaiter
    public final void a(FragmentActivity fragmentActivity) {
        if (!this.b && this.f13951a.add(fragmentActivity)) {
            final View decorView = fragmentActivity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() { // from class: com.bumptech.glide.manager.FirstFrameWaiter.1
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    Util.f().post(new Runnable() { // from class: com.bumptech.glide.manager.FirstFrameWaiter.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            HardwareConfigState hardwareConfigStateA = HardwareConfigState.a();
                            hardwareConfigStateA.getClass();
                            Util.a();
                            hardwareConfigStateA.d.set(true);
                            FirstFrameWaiter.this.b = true;
                            View view = decorView;
                            view.getViewTreeObserver().removeOnDrawListener(this);
                            FirstFrameWaiter.this.f13951a.clear();
                        }
                    });
                }
            });
        }
    }
}
