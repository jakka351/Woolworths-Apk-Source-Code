package androidx.constraintlayout.motion.widget;

import YU.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class KeyTimeCycle extends Key {
    public int e = -1;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public int r = 0;
    public float s = Float.NaN;
    public float t = BitmapDescriptorFactory.HUE_RED;

    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f2334a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2334a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public KeyTimeCycle() {
        this.d = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(HashMap map) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: b */
    public final Key clone() {
        KeyTimeCycle keyTimeCycle = new KeyTimeCycle();
        super.c(this);
        keyTimeCycle.e = this.e;
        keyTimeCycle.r = this.r;
        keyTimeCycle.s = this.s;
        keyTimeCycle.t = this.t;
        keyTimeCycle.q = this.q;
        keyTimeCycle.f = this.f;
        keyTimeCycle.g = this.g;
        keyTimeCycle.h = this.h;
        keyTimeCycle.k = this.k;
        keyTimeCycle.i = this.i;
        keyTimeCycle.j = this.j;
        keyTimeCycle.l = this.l;
        keyTimeCycle.m = this.m;
        keyTimeCycle.n = this.n;
        keyTimeCycle.o = this.o;
        keyTimeCycle.p = this.p;
        return keyTimeCycle;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("progress");
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.n);
        SparseIntArray sparseIntArray = Loader.f2334a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = Loader.f2334a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 5:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 6:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.s0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 12:
                    this.f2329a = typedArrayObtainStyledAttributes.getInt(index, this.f2329a);
                    break;
                case 13:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 14:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 15:
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 16:
                    this.o = typedArrayObtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 17:
                    this.p = typedArrayObtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 18:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.r = 7;
                        break;
                    } else {
                        this.r = typedArrayObtainStyledAttributes.getInt(index, this.r);
                        break;
                    }
                case 20:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.t = typedArrayObtainStyledAttributes.getDimension(index, this.t);
                        break;
                    } else {
                        this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                        break;
                    }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void f(HashMap map) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            map.put("alpha", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.g)) {
            map.put("elevation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.h)) {
            map.put("rotation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.i)) {
            map.put("rotationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.n)) {
            map.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            map.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            map.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            map.put("progress", Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                map.put(a.A("CUSTOM,", (String) it.next()), Integer.valueOf(this.e));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTimeCycle.h(java.util.HashMap):void");
    }
}
