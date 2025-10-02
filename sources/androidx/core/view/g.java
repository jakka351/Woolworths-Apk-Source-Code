package androidx.core.view;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.MultipleValuesAnimator;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) throws Resources.NotFoundException {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((ViewPropertyAnimatorUpdateListener) obj2).a();
                break;
            case 1:
                MultipleValuesAnimator multipleValuesAnimator = (MultipleValuesAnimator) obj2;
                Intrinsics.h(it, "it");
                LinkedHashMap linkedHashMap = multipleValuesAnimator.f7410a;
                Object key = ((Map.Entry) obj).getKey();
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                linkedHashMap.put(key, (Float) animatedValue);
                AtomicInteger atomicInteger = multipleValuesAnimator.h;
                if (atomicInteger.decrementAndGet() == 0) {
                    au.com.woolworths.feature.shop.instore.navigation.map.utils.a aVar = multipleValuesAnimator.l;
                    if (aVar != null) {
                        aVar.invoke(multipleValuesAnimator.f7410a);
                    }
                    atomicInteger.set(multipleValuesAnimator.g);
                    break;
                }
                break;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.C;
                float fFloatValue = ((Float) it.getAnimatedValue()).floatValue();
                ((MaterialShapeDrawable) obj).l(fFloatValue);
                Drawable drawable = appBarLayout.y;
                if (drawable instanceof MaterialShapeDrawable) {
                    ((MaterialShapeDrawable) drawable).l(fFloatValue);
                }
                Iterator it2 = appBarLayout.u.iterator();
                while (it2.hasNext()) {
                    ((AppBarLayout.LiftOnScrollListener) it2.next()).a();
                }
                break;
        }
    }
}
