package androidx.compose.animation.graphics.vector;

import androidx.camera.core.impl.b;
import androidx.collection.MutableScatterMap;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/graphics/vector/ObjectAnimator;", "Landroidx/compose/animation/graphics/vector/Animator;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class ObjectAnimator extends Animator {

    /* renamed from: a, reason: collision with root package name */
    public final int f813a;
    public final int b;
    public final int c;
    public final RepeatMode d;
    public final ArrayList e;
    public final int f;

    public ObjectAnimator(int i, int i2, int i3, RepeatMode repeatMode, ArrayList arrayList) {
        this.f813a = i;
        this.b = i2;
        this.c = i3;
        this.d = repeatMode;
        this.e = arrayList;
        this.f = i3 == -1 ? Integer.MAX_VALUE : ((i3 + 1) * i) + i2;
    }

    @Override // androidx.compose.animation.graphics.vector.Animator
    public final void b(MutableScatterMap mutableScatterMap, int i, int i2) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            PropertyValuesHolder propertyValuesHolder = (PropertyValuesHolder) arrayList.get(i3);
            if (!(propertyValuesHolder instanceof PropertyValuesHolder2D)) {
                boolean z = propertyValuesHolder instanceof PropertyValuesHolderFloat;
                RepeatMode repeatMode = this.d;
                int i4 = this.b;
                if (z) {
                    Object obj = ((PropertyValuesHolderFloat) propertyValuesHolder).f815a;
                    FloatPropertyValues floatPropertyValues = (FloatPropertyValues) mutableScatterMap.e(obj);
                    if (floatPropertyValues == null) {
                        floatPropertyValues = new FloatPropertyValues();
                    }
                    FloatPropertyValues floatPropertyValues2 = floatPropertyValues;
                    floatPropertyValues2.f814a.add(new Timestamp(i4 + i2, this.f813a, this.c, repeatMode, (PropertyValuesHolder1D) propertyValuesHolder));
                    mutableScatterMap.m(obj, floatPropertyValues2);
                } else if (propertyValuesHolder instanceof PropertyValuesHolderColor) {
                    Object obj2 = ((PropertyValuesHolderColor) propertyValuesHolder).f815a;
                    ColorPropertyValues colorPropertyValues = (ColorPropertyValues) mutableScatterMap.e(obj2);
                    if (colorPropertyValues == null) {
                        colorPropertyValues = new ColorPropertyValues();
                    }
                    ColorPropertyValues colorPropertyValues2 = colorPropertyValues;
                    colorPropertyValues2.f814a.add(new Timestamp(i4 + i2, this.f813a, this.c, repeatMode, (PropertyValuesHolder1D) propertyValuesHolder));
                    mutableScatterMap.m(obj2, colorPropertyValues2);
                } else if (propertyValuesHolder instanceof PropertyValuesHolderPath) {
                    Object obj3 = ((PropertyValuesHolderPath) propertyValuesHolder).f815a;
                    PathPropertyValues pathPropertyValues = (PathPropertyValues) mutableScatterMap.e(obj3);
                    if (pathPropertyValues == null) {
                        pathPropertyValues = new PathPropertyValues();
                    }
                    PathPropertyValues pathPropertyValues2 = pathPropertyValues;
                    pathPropertyValues2.f814a.add(new Timestamp(i4 + i2, this.f813a, this.c, repeatMode, (PropertyValuesHolder1D) propertyValuesHolder));
                    mutableScatterMap.m(obj3, pathPropertyValues2);
                }
            }
        }
    }

    @Override // androidx.compose.animation.graphics.vector.Animator
    /* renamed from: c, reason: from getter */
    public final int getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectAnimator)) {
            return false;
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) obj;
        return this.f813a == objectAnimator.f813a && this.b == objectAnimator.b && this.c == objectAnimator.c && this.d == objectAnimator.d && this.e.equals(objectAnimator.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + b.a(this.c, b.a(this.b, Integer.hashCode(this.f813a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ObjectAnimator(duration=" + this.f813a + ", startDelay=" + this.b + ", repeatCount=" + this.c + ", repeatMode=" + this.d + ", holders=" + this.e + ')';
    }
}
