package androidx.compose.animation.core;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@SourceDebugExtension
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final KeyframesSpecConfig f764a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/KeyframeBaseEntity;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return keyframeEntity.f763a.equals(this.f763a) && Intrinsics.c(keyframeEntity.b, this.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + androidx.camera.core.impl.b.a(0, this.f763a.hashCode() * 31, 31);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public final KeyframeEntity a(int i, Object obj) {
            KeyframeEntity keyframeEntity = new KeyframeEntity(obj, EasingKt.d);
            this.b.h(i, keyframeEntity);
            return keyframeEntity;
        }
    }

    public KeyframesSpec(KeyframesSpecConfig keyframesSpecConfig) {
        this.f764a = keyframesSpecConfig;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final VectorizedKeyframesSpec a(TwoWayConverter twoWayConverter) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        KeyframesSpecConfig keyframesSpecConfig = this.f764a;
        MutableIntObjectMap mutableIntObjectMap = keyframesSpecConfig.b;
        MutableIntList mutableIntList = new MutableIntList(mutableIntObjectMap.e + 2);
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap(mutableIntObjectMap.e);
        int[] iArr3 = mutableIntObjectMap.b;
        Object[] objArr3 = mutableIntObjectMap.c;
        long[] jArr = mutableIntObjectMap.f678a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            i = i3;
                            KeyframeEntity keyframeEntity = (KeyframeEntity) objArr3[i6];
                            mutableIntList.c(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            mutableIntObjectMap2.h(i7, new VectorizedKeyframeSpecElementInfo((AnimationVector) twoWayConverter.a().invoke(keyframeEntity.f763a), keyframeEntity.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        iArr3 = iArr2;
                        i3 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!mutableIntObjectMap.a(0)) {
            int i8 = mutableIntList.b;
            if (i8 < 0) {
                RuntimeHelpersKt.c("Index must be between 0 and size");
                throw null;
            }
            mutableIntList.d(i8 + 1);
            int[] iArr4 = mutableIntList.f676a;
            int i9 = mutableIntList.b;
            if (i9 != 0) {
                ArraysKt.q(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            mutableIntList.b++;
        }
        if (!mutableIntObjectMap.a(keyframesSpecConfig.f765a)) {
            mutableIntList.c(keyframesSpecConfig.f765a);
        }
        int i10 = mutableIntList.b;
        if (i10 != 0) {
            int[] iArr5 = mutableIntList.f676a;
            Intrinsics.h(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i10);
        }
        return new VectorizedKeyframesSpec(mutableIntList, mutableIntObjectMap2, keyframesSpecConfig.f765a, EasingKt.d);
    }
}
