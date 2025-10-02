package au.com.woolworths.foundation.appcomms.inbox.client.model;

import YU.a;
import androidx.camera.core.impl.b;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage;", "", "Cta", "Category", "TermsAndConditions", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InboxMessage {

    /* renamed from: a, reason: collision with root package name */
    public final String f8440a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Cta f;
    public final Category g;
    public final TermsAndConditions h;
    public final Instant i;
    public final boolean j;
    public final boolean k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage$Category;", "", "Companion", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Category {
        public static final Companion e;
        public static final Category f;
        public static final Category g;
        public static final Category h;
        public static final /* synthetic */ Category[] i;
        public static final /* synthetic */ EnumEntries j;
        public final String d;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage$Category$Companion;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }

        static {
            Category category = new Category("ForYou", 0, "For you");
            f = category;
            Category category2 = new Category("Boost", 1, "Boost");
            g = category2;
            Category category3 = new Category("Updates", 2, "Updates");
            h = category3;
            Category[] categoryArr = {category, category2, category3};
            i = categoryArr;
            j = EnumEntriesKt.a(categoryArr);
            e = new Companion();
        }

        public Category(String str, int i2, String str2) {
            this.d = str2;
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) i.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage$Cta;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f8441a;
        public final String b;

        public Cta(String label, String url) {
            Intrinsics.h(label, "label");
            Intrinsics.h(url, "url");
            this.f8441a = label;
            this.b = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f8441a, cta.f8441a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8441a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Cta(label=", this.f8441a, ", url=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage$TermsAndConditions;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f8442a;
        public final String b;

        public TermsAndConditions(String buttonLabel, String markdownContent) {
            Intrinsics.h(buttonLabel, "buttonLabel");
            Intrinsics.h(markdownContent, "markdownContent");
            this.f8442a = buttonLabel;
            this.b = markdownContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) obj;
            return Intrinsics.c(this.f8442a, termsAndConditions.f8442a) && Intrinsics.c(this.b, termsAndConditions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8442a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("TermsAndConditions(buttonLabel=", this.f8442a, ", markdownContent=", this.b, ")");
        }
    }

    public InboxMessage(String id, String campaignCode, String str, String str2, String str3, Cta cta, Category category, TermsAndConditions termsAndConditions, Instant instant, boolean z, boolean z2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(campaignCode, "campaignCode");
        this.f8440a = id;
        this.b = campaignCode;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = cta;
        this.g = category;
        this.h = termsAndConditions;
        this.i = instant;
        this.j = z;
        this.k = z2;
    }

    public static InboxMessage a(InboxMessage inboxMessage, int i) {
        String id = inboxMessage.f8440a;
        String campaignCode = inboxMessage.b;
        String str = inboxMessage.c;
        String str2 = inboxMessage.d;
        String str3 = inboxMessage.e;
        Cta cta = (i & 32) != 0 ? inboxMessage.f : null;
        Category category = (i & 64) != 0 ? inboxMessage.g : null;
        TermsAndConditions termsAndConditions = (i & 128) != 0 ? inboxMessage.h : null;
        Instant instant = inboxMessage.i;
        boolean z = inboxMessage.j;
        boolean z2 = inboxMessage.k;
        Intrinsics.h(id, "id");
        Intrinsics.h(campaignCode, "campaignCode");
        return new InboxMessage(id, campaignCode, str, str2, str3, cta, category, termsAndConditions, instant, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxMessage)) {
            return false;
        }
        InboxMessage inboxMessage = (InboxMessage) obj;
        return Intrinsics.c(this.f8440a, inboxMessage.f8440a) && Intrinsics.c(this.b, inboxMessage.b) && Intrinsics.c(this.c, inboxMessage.c) && Intrinsics.c(this.d, inboxMessage.d) && Intrinsics.c(this.e, inboxMessage.e) && Intrinsics.c(this.f, inboxMessage.f) && this.g == inboxMessage.g && Intrinsics.c(this.h, inboxMessage.h) && this.i.equals(inboxMessage.i) && this.j == inboxMessage.j && this.k == inboxMessage.k;
    }

    public final int hashCode() {
        int iC = b.c(this.f8440a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Cta cta = this.f;
        int iHashCode4 = (iHashCode3 + (cta == null ? 0 : cta.hashCode())) * 31;
        Category category = this.g;
        int iHashCode5 = (iHashCode4 + (category == null ? 0 : category.hashCode())) * 31;
        TermsAndConditions termsAndConditions = this.h;
        return Boolean.hashCode(this.k) + b.e((this.i.hashCode() + ((iHashCode5 + (termsAndConditions != null ? termsAndConditions.hashCode() : 0)) * 31)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sbV = a.v("InboxMessage(id=", this.f8440a, ", campaignCode=", this.b, ", campaignVariant=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", title=", this.d, ", body=");
        sbV.append(this.e);
        sbV.append(", cta=");
        sbV.append(this.f);
        sbV.append(", category=");
        sbV.append(this.g);
        sbV.append(", termsAndConditions=");
        sbV.append(this.h);
        sbV.append(", createdOn=");
        sbV.append(this.i);
        sbV.append(", seen=");
        sbV.append(this.j);
        sbV.append(", fromSwrve=");
        return a.k(")", sbV, this.k);
    }
}
