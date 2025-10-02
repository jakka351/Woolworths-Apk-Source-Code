package com.skydoves.balloon;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.skydoves.balloon.Balloon;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Balloon e;

    public /* synthetic */ a(Balloon balloon, int i) {
        this.d = i;
        this.e = balloon;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        Animation animationLoadAnimation;
        switch (this.d) {
            case 0:
                Balloon this$0 = this.e;
                Intrinsics.h(this$0, "this$0");
                new Handler(Looper.getMainLooper()).postDelayed(new a(this$0, 1), 0L);
                return;
            default:
                Balloon this$02 = this.e;
                Intrinsics.h(this$02, "this$0");
                Balloon.Builder builder = this$02.e;
                int i = builder.W;
                if (i != Integer.MIN_VALUE) {
                    animationLoadAnimation = AnimationUtils.loadAnimation(this$02.d, i);
                } else {
                    int iOrdinal = builder.V.ordinal();
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            int iOrdinal2 = builder.n.ordinal();
                            if (iOrdinal2 == 0) {
                                i = com.woolworths.R.anim.balloon_shake_top;
                            } else if (iOrdinal2 == 1) {
                                i = com.woolworths.R.anim.balloon_shake_bottom;
                            } else if (iOrdinal2 == 2) {
                                i = com.woolworths.R.anim.balloon_shake_right;
                            } else {
                                if (iOrdinal2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = com.woolworths.R.anim.balloon_shake_left;
                            }
                        } else if (iOrdinal != 3) {
                            animationLoadAnimation = null;
                        } else {
                            i = com.woolworths.R.anim.balloon_fade;
                        }
                    } else if (builder.h) {
                        int iOrdinal3 = builder.n.ordinal();
                        if (iOrdinal3 == 0) {
                            i = com.woolworths.R.anim.balloon_heartbeat_top;
                        } else if (iOrdinal3 == 1) {
                            i = com.woolworths.R.anim.balloon_heartbeat_bottom;
                        } else if (iOrdinal3 == 2) {
                            i = com.woolworths.R.anim.balloon_heartbeat_right;
                        } else {
                            if (iOrdinal3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = com.woolworths.R.anim.balloon_heartbeat_left;
                        }
                    } else {
                        i = com.woolworths.R.anim.balloon_heartbeat_center;
                    }
                    animationLoadAnimation = AnimationUtils.loadAnimation(this$02.d, i);
                }
                if (animationLoadAnimation != null) {
                    this$02.f.e.startAnimation(animationLoadAnimation);
                    return;
                }
                return;
        }
    }
}
