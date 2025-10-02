package au.com.woolworths.feature.shop.instore.navigation.map.utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/utils/MultipleValuesAnimator;", "", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MultipleValuesAnimator {
    public int g;
    public boolean j;
    public a l;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7410a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public AnimatorSet e = new AnimatorSet();
    public final LinearInterpolator f = new LinearInterpolator();
    public final AtomicInteger h = new AtomicInteger(0);
    public final ReentrantLock i = new ReentrantLock();
    public final float k = 0.01f;
    public final long m = 250;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/utils/MultipleValuesAnimator$Companion;", "", "", "CHANGE_TOLERANCE", "F", "", "ANIMATION_DURATION_MS", "J", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a(final CloseableCoroutineScope closeableCoroutineScope) throws Resources.NotFoundException {
        ArrayList arrayList = this.d;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.b;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            LinkedHashMap linkedHashMap2 = this.f7410a;
            Float f = (Float) linkedHashMap2.get(key);
            if (f != null) {
                float fFloatValue = f.floatValue();
                if (Math.abs(fFloatValue - ((Number) entry.getValue()).floatValue()) > this.k) {
                    ValueAnimator valueAnimator = (ValueAnimator) this.c.get(entry.getKey());
                    if (valueAnimator != null) {
                        valueAnimator.setFloatValues(fFloatValue, ((Number) entry.getValue()).floatValue());
                        arrayList.add(valueAnimator);
                    } else {
                        Bark.Companion companion = Bark.f8483a;
                        Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "play: no animator for " + entry.getKey() + "!", null);
                    }
                }
            } else {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (arrayList.isEmpty()) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.invoke(linkedHashMap);
                return;
            }
            return;
        }
        this.j = true;
        this.g = arrayList.size();
        this.h.set(arrayList.size());
        AnimatorSet animatorSet = new AnimatorSet();
        this.e = animatorSet;
        animatorSet.setDuration(this.m);
        this.e.setInterpolator(this.f);
        this.e.addListener(new Animator.AnimatorListener() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.utils.MultipleValuesAnimator$resetAnimatorSet$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.d.j = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                MultipleValuesAnimator multipleValuesAnimator = this.d;
                ReentrantLock reentrantLock = multipleValuesAnimator.i;
                reentrantLock.lock();
                try {
                    multipleValuesAnimator.j = false;
                    multipleValuesAnimator.a(closeableCoroutineScope);
                } finally {
                    reentrantLock.unlock();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        this.e.playTogether(arrayList);
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(closeableCoroutineScope, MainDispatcherLoader.f24726a, null, new MultipleValuesAnimator$play$2(this, null), 2);
    }
}
