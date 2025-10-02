package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "b", "invoke", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1 extends Lambda implements Function2<SemanticsNode, SemanticsNode, Integer> {
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1 h = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1(2);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends Lambda implements Function0<Float> {
        public static final AnonymousClass1 h = new AnonymousClass1(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends Lambda implements Function0<Float> {
        public static final AnonymousClass2 h = new AnonymousClass2(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SemanticsConfiguration semanticsConfiguration = ((SemanticsNode) obj).d;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.r;
        return Integer.valueOf(Float.compare(((Number) semanticsConfiguration.h(semanticsPropertyKey, AnonymousClass1.h)).floatValue(), ((Number) ((SemanticsNode) obj2).d.h(semanticsPropertyKey, AnonymousClass2.h)).floatValue()));
    }
}
