package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/Transition$Segment;", "", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PropertyValues$createAnimationSpec$1 extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Object>> {
    public final /* synthetic */ PropertyValues h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyValues$createAnimationSpec$1(PropertyValues propertyValues, int i) {
        super(3);
        this.h = propertyValues;
        this.i = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.animation.core.DurationBasedAnimationSpec] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.animation.core.RepeatableSpec] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KeyframesSpec keyframesSpecB;
        Transition.Segment segment = (Transition.Segment) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-361329948);
        ArrayList arrayList = this.h.f814a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Timestamp timestamp = (Timestamp) arrayList.get(i);
            Integer numValueOf = Integer.valueOf(timestamp.f819a);
            final int i2 = timestamp.b;
            PropertyValuesHolder1D propertyValuesHolder1D = timestamp.e;
            if (propertyValuesHolder1D instanceof PropertyValuesHolderFloat) {
                final PropertyValuesHolderFloat propertyValuesHolderFloat = (PropertyValuesHolderFloat) propertyValuesHolder1D;
                keyframesSpecB = AnimationSpecKt.b(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat$asKeyframeSpec$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj4;
                        int i3 = i2;
                        keyframesSpecConfig.f765a = i3;
                        ArrayList arrayList3 = propertyValuesHolderFloat.b;
                        int size2 = arrayList3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            Keyframe keyframe = (Keyframe) arrayList3.get(i4);
                            keyframesSpecConfig.a((int) (i3 * keyframe.f812a), keyframe.b).b = keyframe.c;
                        }
                        return Unit.f24250a;
                    }
                });
            } else {
                if (!(propertyValuesHolder1D instanceof PropertyValuesHolderColor)) {
                    throw new RuntimeException("Unexpected value type: " + propertyValuesHolder1D);
                }
                final PropertyValuesHolderColor propertyValuesHolderColor = (PropertyValuesHolderColor) propertyValuesHolder1D;
                keyframesSpecB = AnimationSpecKt.b(new Function1<KeyframesSpec.KeyframesSpecConfig<Color>, Unit>() { // from class: androidx.compose.animation.graphics.vector.PropertyValuesHolderColor$asKeyframeSpec$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj4;
                        int i3 = i2;
                        keyframesSpecConfig.f765a = i3;
                        ArrayList arrayList3 = propertyValuesHolderColor.b;
                        int size2 = arrayList3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            Keyframe keyframe = (Keyframe) arrayList3.get(i4);
                            keyframesSpecConfig.a((int) (i3 * keyframe.f812a), keyframe.b).b = keyframe.c;
                        }
                        return Unit.f24250a;
                    }
                });
            }
            Object objC = keyframesSpecB;
            int i3 = timestamp.c;
            if (i3 != 0) {
                objC = AnimationSpecKt.c(i3 == -1 ? Integer.MAX_VALUE : i3 + 1, objC, timestamp.d, 0L, 8);
            }
            arrayList2.add(new Pair(numValueOf, objC));
        }
        FiniteAnimationSpec combinedSpec = new CombinedSpec(arrayList2);
        if (!((Boolean) segment.getB()).booleanValue()) {
            combinedSpec = new ReversedSpec(combinedSpec, this.i);
        }
        composer.l();
        return combinedSpec;
    }
}
