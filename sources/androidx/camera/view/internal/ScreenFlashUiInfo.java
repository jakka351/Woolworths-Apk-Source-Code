package androidx.camera.view.internal;

import androidx.camera.core.ImageCapture;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ScreenFlashUiInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ProviderType f662a;
    public final ImageCapture.ScreenFlash b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ProviderType {
        public static final ProviderType d;
        public static final ProviderType e;
        public static final /* synthetic */ ProviderType[] f;

        static {
            ProviderType providerType = new ProviderType("PREVIEW_VIEW", 0);
            d = providerType;
            ProviderType providerType2 = new ProviderType("SCREEN_FLASH_VIEW", 1);
            e = providerType2;
            f = new ProviderType[]{providerType, providerType2};
        }

        public static ProviderType valueOf(String str) {
            return (ProviderType) Enum.valueOf(ProviderType.class, str);
        }

        public static ProviderType[] values() {
            return (ProviderType[]) f.clone();
        }
    }

    public ScreenFlashUiInfo(ProviderType providerType, ImageCapture.ScreenFlash screenFlash) {
        this.f662a = providerType;
        this.b = screenFlash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenFlashUiInfo)) {
            return false;
        }
        ScreenFlashUiInfo screenFlashUiInfo = (ScreenFlashUiInfo) obj;
        return this.f662a == screenFlashUiInfo.f662a && Objects.equals(this.b, screenFlashUiInfo.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f662a, this.b);
    }
}
