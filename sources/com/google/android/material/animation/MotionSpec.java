package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class MotionSpec {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f14510a = new SimpleArrayMap(0);
    public final SimpleArrayMap b = new SimpleArrayMap(0);

    public static MotionSpec a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(resourceId, context);
    }

    public static MotionSpec b(int i, Context context) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static MotionSpec c(ArrayList arrayList) {
        MotionSpec motionSpec = new MotionSpec();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AnimationUtils.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AnimationUtils.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AnimationUtils.d;
            }
            MotionTiming motionTiming = new MotionTiming();
            motionTiming.d = 0;
            motionTiming.e = 1;
            motionTiming.f14511a = startDelay;
            motionTiming.b = duration;
            motionTiming.c = interpolator;
            motionTiming.d = objectAnimator.getRepeatCount();
            motionTiming.e = objectAnimator.getRepeatMode();
            motionSpec.f14510a.put(propertyName, motionTiming);
        }
        return motionSpec;
    }

    public final ObjectAnimator d(String str, Object obj, Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, e(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        f(str).a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final PropertyValuesHolder[] e(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.f14510a.equals(((MotionSpec) obj).f14510a);
        }
        return false;
    }

    public final MotionTiming f(String str) {
        SimpleArrayMap simpleArrayMap = this.f14510a;
        if (simpleArrayMap.get(str) != null) {
            return (MotionTiming) simpleArrayMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean g(String str) {
        return this.b.get(str) != null;
    }

    public final void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f14510a.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f14510a + "}\n";
    }
}
