package androidx.constraintlayout.motion.widget;

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
public class KeyCycle extends Key {
    public int e = 0;
    public int f = -1;
    public String g = null;
    public float h = Float.NaN;
    public float i = BitmapDescriptorFactory.HUE_RED;
    public float j = BitmapDescriptorFactory.HUE_RED;
    public float k = Float.NaN;
    public int l = -1;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;

    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f2331a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2331a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public KeyCycle() {
        this.d = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(HashMap map) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: b */
    public final Key clone() {
        KeyCycle keyCycle = new KeyCycle();
        super.c(this);
        keyCycle.e = this.e;
        keyCycle.f = this.f;
        keyCycle.g = this.g;
        keyCycle.h = this.h;
        keyCycle.i = this.i;
        keyCycle.j = this.j;
        keyCycle.k = this.k;
        keyCycle.l = this.l;
        keyCycle.m = this.m;
        keyCycle.n = this.n;
        keyCycle.o = this.o;
        keyCycle.p = this.p;
        keyCycle.q = this.q;
        keyCycle.r = this.r;
        keyCycle.s = this.s;
        keyCycle.t = this.t;
        keyCycle.u = this.u;
        keyCycle.v = this.v;
        keyCycle.w = this.w;
        return keyCycle;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationZ");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.l);
        SparseIntArray sparseIntArray = Loader.f2331a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = Loader.f2331a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.f2329a = typedArrayObtainStyledAttributes.getInt(index, this.f2329a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = typedArrayObtainStyledAttributes.getString(index);
                        this.f = 7;
                        break;
                    } else {
                        this.f = typedArrayObtainStyledAttributes.getInt(index, this.f);
                        break;
                    }
                case 6:
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    } else {
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                        break;
                    }
                case 8:
                    this.l = typedArrayObtainStyledAttributes.getInt(index, this.l);
                    break;
                case 9:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 10:
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 11:
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 12:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 13:
                    this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 14:
                    this.p = typedArrayObtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 15:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 16:
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 17:
                    this.u = typedArrayObtainStyledAttributes.getDimension(index, this.u);
                    break;
                case 18:
                    this.v = typedArrayObtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 19:
                    this.w = typedArrayObtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 20:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 21:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.HashMap r14) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyCycle.h(java.util.HashMap):void");
    }
}
