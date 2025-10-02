package au.com.woolworths.foundation.shop.olive.voice.ui.dialog;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType;", "", "NoPermissionDialog", "NoDeviceLevelPermissionDialog", "NoSupportedLanguageDialog", "LanguageUnavailableDialog", "Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType$LanguageUnavailableDialog;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType$NoDeviceLevelPermissionDialog;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType$NoPermissionDialog;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType$NoSupportedLanguageDialog;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DialogType {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType$LanguageUnavailableDialog;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LanguageUnavailableDialog implements DialogType {

        /* renamed from: a, reason: collision with root package name */
        public static final LanguageUnavailableDialog f8839a = new LanguageUnavailableDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LanguageUnavailableDialog);
        }

        public final int hashCode() {
            return 989056665;
        }

        public final String toString() {
            return "LanguageUnavailableDialog";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType$NoDeviceLevelPermissionDialog;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoDeviceLevelPermissionDialog implements DialogType {

        /* renamed from: a, reason: collision with root package name */
        public static final NoDeviceLevelPermissionDialog f8840a = new NoDeviceLevelPermissionDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoDeviceLevelPermissionDialog);
        }

        public final int hashCode() {
            return 1658816829;
        }

        public final String toString() {
            return "NoDeviceLevelPermissionDialog";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType$NoPermissionDialog;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoPermissionDialog implements DialogType {

        /* renamed from: a, reason: collision with root package name */
        public static final NoPermissionDialog f8841a = new NoPermissionDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoPermissionDialog);
        }

        public final int hashCode() {
            return -657938273;
        }

        public final String toString() {
            return "NoPermissionDialog";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType$NoSupportedLanguageDialog;", "Lau/com/woolworths/foundation/shop/olive/voice/ui/dialog/DialogType;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoSupportedLanguageDialog implements DialogType {

        /* renamed from: a, reason: collision with root package name */
        public static final NoSupportedLanguageDialog f8842a = new NoSupportedLanguageDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoSupportedLanguageDialog);
        }

        public final int hashCode() {
            return -580053658;
        }

        public final String toString() {
            return "NoSupportedLanguageDialog";
        }
    }
}
