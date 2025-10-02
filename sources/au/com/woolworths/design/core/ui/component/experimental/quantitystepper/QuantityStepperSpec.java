package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperSpec;", "", "Size", "Variant", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuantityStepperSpec {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperSpec$Size;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Size {
        public static final Size e;
        public static final /* synthetic */ Size[] f;
        public static final /* synthetic */ EnumEntries g;
        public final float d;

        static {
            Size size = new Size("Small", 0, 32);
            Size size2 = new Size("Medium", 1, 40);
            e = size2;
            Size[] sizeArr = {size, size2};
            f = sizeArr;
            g = EnumEntriesKt.a(sizeArr);
        }

        public Size(String str, int i, float f2) {
            this.d = f2;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperSpec$Variant;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Variant {
        public static final /* synthetic */ Variant[] d;
        public static final /* synthetic */ EnumEntries e;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperSpec.Variant.Primary", "Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperSpec$Variant;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Primary extends Variant {
            public Primary() {
                super("Primary", 0);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperSpec.Variant.Secondary", "Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperSpec$Variant;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Secondary extends Variant {
            public Secondary() {
                super("Secondary", 1);
            }
        }

        static {
            Variant[] variantArr = {new Primary(), new Secondary()};
            d = variantArr;
            e = EnumEntriesKt.a(variantArr);
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) d.clone();
        }
    }
}
