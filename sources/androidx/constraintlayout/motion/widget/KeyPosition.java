package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class KeyPosition extends KeyPositionBase {
    public String f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;

    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f2333a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2333a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    public KeyPosition() {
        this.e = -1;
        this.f = null;
        this.g = -1;
        this.h = 0;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = 0;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(HashMap map) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: b */
    public final Key clone() {
        KeyPosition keyPosition = new KeyPosition();
        super.c(this);
        keyPosition.f = this.f;
        keyPosition.g = this.g;
        keyPosition.h = this.h;
        keyPosition.i = this.i;
        keyPosition.j = Float.NaN;
        keyPosition.k = this.k;
        keyPosition.l = this.l;
        return keyPosition;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.m);
        SparseIntArray sparseIntArray = Loader.f2333a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = Loader.f2333a;
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
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f = Easing.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
                    break;
                case 6:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    this.i = f;
                    this.j = f;
                    break;
                case 9:
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                    break;
                case 10:
                    this.g = typedArrayObtainStyledAttributes.getInt(index, this.g);
                    break;
                case 11:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 12:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f2329a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public final void h(String str, Object obj) {
        switch (str) {
            case "transitionEasing":
                this.f = obj.toString();
                break;
            case "percentWidth":
                this.i = Key.g((Number) obj);
                break;
            case "percentHeight":
                this.j = Key.g((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float fG = Key.g((Number) obj);
                this.i = fG;
                this.j = fG;
                break;
            case "percentX":
                this.k = Key.g((Number) obj);
                break;
            case "percentY":
                this.l = Key.g((Number) obj);
                break;
        }
    }
}
