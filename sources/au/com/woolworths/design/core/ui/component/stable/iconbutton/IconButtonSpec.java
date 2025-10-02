package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/iconbutton/IconButtonSpec;", "", "Size", "Tokens", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IconButtonSpec {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/iconbutton/IconButtonSpec$Size;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Size {
        public static final Size f;
        public static final Size g;
        public static final /* synthetic */ Size[] h;
        public static final /* synthetic */ EnumEntries i;
        public final float d;
        public final float e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.f.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.g.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        static {
            float f2 = Tokens.f4762a;
            Size size = new Size(0, "Medium", Tokens.f4762a, Tokens.c);
            f = size;
            Size size2 = new Size(1, "Small", Tokens.b, Tokens.d);
            g = size2;
            Size[] sizeArr = {size, size2};
            h = sizeArr;
            i = EnumEntriesKt.a(sizeArr);
        }

        public Size(int i2, String str, float f2, float f3) {
            this.d = f2;
            this.e = f3;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) h.clone();
        }

        public final ButtonSpec.Size a() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return ButtonSpec.Size.g;
            }
            if (iOrdinal == 1) {
                return ButtonSpec.Size.h;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/iconbutton/IconButtonSpec$Tokens;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes.dex */
    public static final class Tokens {

        /* renamed from: a, reason: collision with root package name */
        public static final float f4762a = 40;
        public static final float b = 32;
        public static final float c = 24;
        public static final float d = 20;
    }
}
