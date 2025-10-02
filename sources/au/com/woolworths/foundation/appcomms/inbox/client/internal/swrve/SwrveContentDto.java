package au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.shop.bundles.ui.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto;", "", "Companion", "Button", "CategoryTag", "TermsAndConditions", "$serializer", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class SwrveContentDto {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.d, new a(8)), null};

    /* renamed from: a, reason: collision with root package name */
    public final String f8424a;
    public final String b;
    public final String c;
    public final Button d;
    public final List e;
    public final TermsAndConditions f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$Button;", "", "Companion", "$serializer", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Button {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f8429a;
        public final String b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$Button$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$Button;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<Button> serializer() {
                return SwrveContentDto$Button$$serializer.f8426a;
            }
        }

        public /* synthetic */ Button(int i, String str, String str2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, SwrveContentDto$Button$$serializer.f8426a.getB());
                throw null;
            }
            this.f8429a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f8429a, button.f8429a) && Intrinsics.c(this.b, button.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8429a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Button(label=", this.f8429a, ", url=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$CategoryTag;", "", "Companion", "$serializer", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CategoryTag {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f8430a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$CategoryTag$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$CategoryTag;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<CategoryTag> serializer() {
                return SwrveContentDto$CategoryTag$$serializer.f8427a;
            }
        }

        public /* synthetic */ CategoryTag(int i, String str) {
            if (1 == (i & 1)) {
                this.f8430a = str;
            } else {
                PluginExceptionsKt.a(i, 1, SwrveContentDto$CategoryTag$$serializer.f8427a.getB());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryTag) && Intrinsics.c(this.f8430a, ((CategoryTag) obj).f8430a);
        }

        public final int hashCode() {
            return this.f8430a.hashCode();
        }

        public final String toString() {
            return YU.a.h("CategoryTag(name=", this.f8430a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SwrveContentDto> serializer() {
            return SwrveContentDto$$serializer.f8425a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$TermsAndConditions;", "", "Companion", "$serializer", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TermsAndConditions {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f8431a;
        public final String b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$TermsAndConditions$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto$TermsAndConditions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<TermsAndConditions> serializer() {
                return SwrveContentDto$TermsAndConditions$$serializer.f8428a;
            }
        }

        public /* synthetic */ TermsAndConditions(int i, String str, String str2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, SwrveContentDto$TermsAndConditions$$serializer.f8428a.getB());
                throw null;
            }
            this.f8431a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) obj;
            return Intrinsics.c(this.f8431a, termsAndConditions.f8431a) && Intrinsics.c(this.b, termsAndConditions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8431a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("TermsAndConditions(buttonLabel=", this.f8431a, ", markdownContent=", this.b, ")");
        }
    }

    public /* synthetic */ SwrveContentDto(int i, String str, String str2, String str3, Button button, List list, TermsAndConditions termsAndConditions) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.a(i, 63, SwrveContentDto$$serializer.f8425a.getB());
            throw null;
        }
        this.f8424a = str;
        this.b = str2;
        this.c = str3;
        this.d = button;
        this.e = list;
        this.f = termsAndConditions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwrveContentDto)) {
            return false;
        }
        SwrveContentDto swrveContentDto = (SwrveContentDto) obj;
        return Intrinsics.c(this.f8424a, swrveContentDto.f8424a) && Intrinsics.c(this.b, swrveContentDto.b) && Intrinsics.c(this.c, swrveContentDto.c) && Intrinsics.c(this.d, swrveContentDto.d) && Intrinsics.c(this.e, swrveContentDto.e) && Intrinsics.c(this.f, swrveContentDto.f);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f8424a.hashCode() * 31, 31, this.b), 31, this.c);
        Button button = this.d;
        int iHashCode = (iC + (button == null ? 0 : button.hashCode())) * 31;
        List list = this.e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        TermsAndConditions termsAndConditions = this.f;
        return iHashCode2 + (termsAndConditions != null ? termsAndConditions.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("SwrveContentDto(swrveCampaignCode=", this.f8424a, ", title=", this.b, ", body=");
        sbV.append(this.c);
        sbV.append(", button=");
        sbV.append(this.d);
        sbV.append(", categoryTags=");
        sbV.append(this.e);
        sbV.append(", termsAndConditions=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
