package androidx.constraintlayout.motion.widget;

import YU.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class KeyAttributes extends Key {
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
    public float r = Float.NaN;
    public float s = Float.NaN;

    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f2330a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2330a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public KeyAttributes() {
        this.d = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    @Override // androidx.constraintlayout.motion.widget.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.HashMap r7) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyAttributes.a(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: b */
    public final Key clone() {
        KeyAttributes keyAttributes = new KeyAttributes();
        super.c(this);
        keyAttributes.e = this.e;
        keyAttributes.f = this.f;
        keyAttributes.g = this.g;
        keyAttributes.h = this.h;
        keyAttributes.i = this.i;
        keyAttributes.j = this.j;
        keyAttributes.k = this.k;
        keyAttributes.l = this.l;
        keyAttributes.m = this.m;
        keyAttributes.n = this.n;
        keyAttributes.o = this.o;
        keyAttributes.p = this.p;
        keyAttributes.q = this.q;
        keyAttributes.r = this.r;
        keyAttributes.s = this.s;
        return keyAttributes;
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
        if (!Float.isNaN(this.k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.k);
        SparseIntArray sparseIntArray = Loader.f2330a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = Loader.f2330a;
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
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
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
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 8:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
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
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 15:
                    this.p = typedArrayObtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 16:
                    this.q = typedArrayObtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 17:
                    this.r = typedArrayObtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 18:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 19:
                    this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 20:
                    this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                    break;
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
        if (!Float.isNaN(this.k)) {
            map.put("transformPivotX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("transformPivotY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            map.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            map.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.r)) {
            map.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.n)) {
            map.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            map.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.s)) {
            map.put("progress", Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                map.put(a.A("CUSTOM,", (String) it.next()), Integer.valueOf(this.e));
            }
        }
    }

    public final void h(String str, Object obj) {
        switch (str) {
            case "motionProgress":
                this.s = Key.g((Number) obj);
                break;
            case "transitionEasing":
                obj.toString();
                break;
            case "rotationX":
                this.i = Key.g((Number) obj);
                break;
            case "rotationY":
                this.j = Key.g((Number) obj);
                break;
            case "translationX":
                this.p = Key.g((Number) obj);
                break;
            case "translationY":
                this.q = Key.g((Number) obj);
                break;
            case "translationZ":
                this.r = Key.g((Number) obj);
                break;
            case "scaleX":
                this.n = Key.g((Number) obj);
                break;
            case "scaleY":
                this.o = Key.g((Number) obj);
                break;
            case "transformPivotX":
                this.k = Key.g((Number) obj);
                break;
            case "transformPivotY":
                this.l = Key.g((Number) obj);
                break;
            case "rotation":
                this.h = Key.g((Number) obj);
                break;
            case "elevation":
                this.g = Key.g((Number) obj);
                break;
            case "transitionPathRotate":
                this.m = Key.g((Number) obj);
                break;
            case "alpha":
                this.f = Key.g((Number) obj);
                break;
            case "curveFit":
                Number number = (Number) obj;
                this.e = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "visibility":
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                }
                break;
        }
    }
}
