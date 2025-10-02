package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;

@RestrictTo
/* loaded from: classes2.dex */
public class AnimatorInflaterCompat {

    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* renamed from: a, reason: collision with root package name */
        public PathParser.PathDataNode[] f3810a;

        @Override // android.animation.TypeEvaluator
        public final PathParser.PathDataNode[] evaluate(float f, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            PathParser.PathDataNode[] pathDataNodeArr3 = pathDataNodeArr;
            PathParser.PathDataNode[] pathDataNodeArr4 = pathDataNodeArr2;
            if (!PathParser.a(pathDataNodeArr3, pathDataNodeArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!PathParser.a(this.f3810a, pathDataNodeArr3)) {
                this.f3810a = PathParser.e(pathDataNodeArr3);
            }
            for (int i = 0; i < pathDataNodeArr3.length; i++) {
                PathParser.PathDataNode pathDataNode = this.f3810a[i];
                PathParser.PathDataNode pathDataNode2 = pathDataNodeArr3[i];
                PathParser.PathDataNode pathDataNode3 = pathDataNodeArr4[i];
                pathDataNode.getClass();
                pathDataNode.f2432a = pathDataNode2.f2432a;
                int i2 = 0;
                while (true) {
                    float[] fArr = pathDataNode2.b;
                    if (i2 < fArr.length) {
                        pathDataNode.b[i2] = (pathDataNode3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.f3810a;
        }
    }
}
