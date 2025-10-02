package au.com.woolworths.feature.rewards.everydayextras.signup;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.adapter.EverydayExtrasSummaryQuery_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.DividerType;
import au.com.woolworths.rewards.graphql.type.EverydayExtraButtonStyle;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0015\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Data;", "Data", "EverydayExtraSummary", "Content", "ContentItem", "OnTitleTextItem", "OnCheckableTextItem", "OnSubheadTextItem", "OnParagraphTextItem", "OnDivider", "OnEverydayExtraWpayPayment", "Errors", "CardErrors", "ErrorItem", "ExternalSystemError", "CardProvider", "OnEverydayExtraSelectedPlan", "Button", "OnSmallAppIconListItem", "Footer", "FooterItem", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasSummaryQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f5949a;
    public final Optional b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Button;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f5950a;
        public final EverydayExtraButtonStyle b;
        public final String c;

        public Button(EverydayExtraButtonStyle everydayExtraButtonStyle, String str, String str2) {
            this.f5950a = str;
            this.b = everydayExtraButtonStyle;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f5950a, button.f5950a) && this.b == button.b && Intrinsics.c(this.c, button.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5950a.hashCode() * 31;
            EverydayExtraButtonStyle everydayExtraButtonStyle = this.b;
            return this.c.hashCode() + ((iHashCode + (everydayExtraButtonStyle == null ? 0 : everydayExtraButtonStyle.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(action=");
            sb.append(this.f5950a);
            sb.append(", style=");
            sb.append(this.b);
            sb.append(", label=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$CardErrors;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardErrors {

        /* renamed from: a, reason: collision with root package name */
        public final String f5951a;
        public final ArrayList b;

        public CardErrors(String str, ArrayList arrayList) {
            this.f5951a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardErrors)) {
                return false;
            }
            CardErrors cardErrors = (CardErrors) obj;
            return this.f5951a.equals(cardErrors.f5951a) && this.b.equals(cardErrors.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5951a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("CardErrors(title=", this.f5951a, ", errorItems=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$CardProvider;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardProvider {

        /* renamed from: a, reason: collision with root package name */
        public final String f5952a;
        public final String b;

        public CardProvider(String str, String str2) {
            this.f5952a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardProvider)) {
                return false;
            }
            CardProvider cardProvider = (CardProvider) obj;
            return Intrinsics.c(this.f5952a, cardProvider.f5952a) && Intrinsics.c(this.b, cardProvider.b);
        }

        public final int hashCode() {
            String str = this.f5952a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return a.j("CardProvider(altText=", this.f5952a, ", iconUrl=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Content;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f5953a;
        public final ArrayList b;

        public Content(String str, ArrayList arrayList) {
            this.f5953a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.f5953a.equals(content.f5953a) && this.b.equals(content.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5953a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Content(id=", this.f5953a, ", contentItems=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$ContentItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5954a;
        public final OnTitleTextItem b;
        public final OnCheckableTextItem c;
        public final OnSubheadTextItem d;
        public final OnParagraphTextItem e;
        public final OnDivider f;
        public final OnEverydayExtraWpayPayment g;
        public final OnEverydayExtraSelectedPlan h;
        public final OnSmallAppIconListItem i;

        public ContentItem(String __typename, OnTitleTextItem onTitleTextItem, OnCheckableTextItem onCheckableTextItem, OnSubheadTextItem onSubheadTextItem, OnParagraphTextItem onParagraphTextItem, OnDivider onDivider, OnEverydayExtraWpayPayment onEverydayExtraWpayPayment, OnEverydayExtraSelectedPlan onEverydayExtraSelectedPlan, OnSmallAppIconListItem onSmallAppIconListItem) {
            Intrinsics.h(__typename, "__typename");
            this.f5954a = __typename;
            this.b = onTitleTextItem;
            this.c = onCheckableTextItem;
            this.d = onSubheadTextItem;
            this.e = onParagraphTextItem;
            this.f = onDivider;
            this.g = onEverydayExtraWpayPayment;
            this.h = onEverydayExtraSelectedPlan;
            this.i = onSmallAppIconListItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem)) {
                return false;
            }
            ContentItem contentItem = (ContentItem) obj;
            return Intrinsics.c(this.f5954a, contentItem.f5954a) && Intrinsics.c(this.b, contentItem.b) && Intrinsics.c(this.c, contentItem.c) && Intrinsics.c(this.d, contentItem.d) && Intrinsics.c(this.e, contentItem.e) && Intrinsics.c(this.f, contentItem.f) && Intrinsics.c(this.g, contentItem.g) && Intrinsics.c(this.h, contentItem.h) && Intrinsics.c(this.i, contentItem.i);
        }

        public final int hashCode() {
            int iHashCode = this.f5954a.hashCode() * 31;
            OnTitleTextItem onTitleTextItem = this.b;
            int iHashCode2 = (iHashCode + (onTitleTextItem == null ? 0 : onTitleTextItem.f5969a.hashCode())) * 31;
            OnCheckableTextItem onCheckableTextItem = this.c;
            int iHashCode3 = (iHashCode2 + (onCheckableTextItem == null ? 0 : onCheckableTextItem.hashCode())) * 31;
            OnSubheadTextItem onSubheadTextItem = this.d;
            int iHashCode4 = (iHashCode3 + (onSubheadTextItem == null ? 0 : onSubheadTextItem.f5968a.hashCode())) * 31;
            OnParagraphTextItem onParagraphTextItem = this.e;
            int iHashCode5 = (iHashCode4 + (onParagraphTextItem == null ? 0 : onParagraphTextItem.f5966a.hashCode())) * 31;
            OnDivider onDivider = this.f;
            int iHashCode6 = (iHashCode5 + (onDivider == null ? 0 : onDivider.f5963a.hashCode())) * 31;
            OnEverydayExtraWpayPayment onEverydayExtraWpayPayment = this.g;
            int iHashCode7 = (iHashCode6 + (onEverydayExtraWpayPayment == null ? 0 : onEverydayExtraWpayPayment.hashCode())) * 31;
            OnEverydayExtraSelectedPlan onEverydayExtraSelectedPlan = this.h;
            int iHashCode8 = (iHashCode7 + (onEverydayExtraSelectedPlan == null ? 0 : onEverydayExtraSelectedPlan.hashCode())) * 31;
            OnSmallAppIconListItem onSmallAppIconListItem = this.i;
            return iHashCode8 + (onSmallAppIconListItem != null ? onSmallAppIconListItem.hashCode() : 0);
        }

        public final String toString() {
            return "ContentItem(__typename=" + this.f5954a + ", onTitleTextItem=" + this.b + ", onCheckableTextItem=" + this.c + ", onSubheadTextItem=" + this.d + ", onParagraphTextItem=" + this.e + ", onDivider=" + this.f + ", onEverydayExtraWpayPayment=" + this.g + ", onEverydayExtraSelectedPlan=" + this.h + ", onSmallAppIconListItem=" + this.i + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EverydayExtraSummary f5955a;

        public Data(EverydayExtraSummary everydayExtraSummary) {
            this.f5955a = everydayExtraSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f5955a, ((Data) obj).f5955a);
        }

        public final int hashCode() {
            EverydayExtraSummary everydayExtraSummary = this.f5955a;
            if (everydayExtraSummary == null) {
                return 0;
            }
            return everydayExtraSummary.hashCode();
        }

        public final String toString() {
            return "Data(everydayExtraSummary=" + this.f5955a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$ErrorItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5956a;
        public final String b;
        public final String c;

        public ErrorItem(String str, String str2, String str3) {
            this.f5956a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorItem)) {
                return false;
            }
            ErrorItem errorItem = (ErrorItem) obj;
            return Intrinsics.c(this.f5956a, errorItem.f5956a) && Intrinsics.c(this.b, errorItem.b) && Intrinsics.c(this.c, errorItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5956a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("ErrorItem(domId=", this.f5956a, ", key=", this.b, ", value="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Errors;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Errors {

        /* renamed from: a, reason: collision with root package name */
        public final String f5957a;
        public final CardErrors b;
        public final ExternalSystemError c;

        public Errors(String str, CardErrors cardErrors, ExternalSystemError externalSystemError) {
            this.f5957a = str;
            this.b = cardErrors;
            this.c = externalSystemError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Errors)) {
                return false;
            }
            Errors errors = (Errors) obj;
            return Intrinsics.c(this.f5957a, errors.f5957a) && Intrinsics.c(this.b, errors.b) && Intrinsics.c(this.c, errors.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f5957a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Errors(__typename=" + this.f5957a + ", cardErrors=" + this.b + ", externalSystemError=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$EverydayExtraSummary;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtraSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f5958a;
        public final Content b;
        public final Footer c;

        public EverydayExtraSummary(String str, Content content, Footer footer) {
            this.f5958a = str;
            this.b = content;
            this.c = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EverydayExtraSummary)) {
                return false;
            }
            EverydayExtraSummary everydayExtraSummary = (EverydayExtraSummary) obj;
            return Intrinsics.c(this.f5958a, everydayExtraSummary.f5958a) && Intrinsics.c(this.b, everydayExtraSummary.b) && Intrinsics.c(this.c, everydayExtraSummary.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f5958a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "EverydayExtraSummary(navigationTitle=" + this.f5958a + ", content=" + this.b + ", footer=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$ExternalSystemError;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExternalSystemError {

        /* renamed from: a, reason: collision with root package name */
        public final String f5959a;
        public final String b;
        public final String c;

        public ExternalSystemError(String str, String str2, String str3) {
            this.f5959a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExternalSystemError)) {
                return false;
            }
            ExternalSystemError externalSystemError = (ExternalSystemError) obj;
            return Intrinsics.c(this.f5959a, externalSystemError.f5959a) && Intrinsics.c(this.b, externalSystemError.b) && Intrinsics.c(this.c, externalSystemError.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5959a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("ExternalSystemError(__typename=", this.f5959a, ", title=", this.b, ", value="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Footer;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f5960a;
        public final ArrayList b;

        public Footer(String str, ArrayList arrayList) {
            this.f5960a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return this.f5960a.equals(footer.f5960a) && this.b.equals(footer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5960a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Footer(id=", this.f5960a, ", footerItems=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$FooterItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5961a;
        public final String b;
        public final EverydayExtraButtonStyle c;

        public FooterItem(EverydayExtraButtonStyle everydayExtraButtonStyle, String str, String str2) {
            this.f5961a = str;
            this.b = str2;
            this.c = everydayExtraButtonStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterItem)) {
                return false;
            }
            FooterItem footerItem = (FooterItem) obj;
            return Intrinsics.c(this.f5961a, footerItem.f5961a) && Intrinsics.c(this.b, footerItem.b) && this.c == footerItem.c;
        }

        public final int hashCode() {
            int iC = b.c(this.f5961a.hashCode() * 31, 31, this.b);
            EverydayExtraButtonStyle everydayExtraButtonStyle = this.c;
            return iC + (everydayExtraButtonStyle == null ? 0 : everydayExtraButtonStyle.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("FooterItem(label=", this.f5961a, ", action=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnCheckableTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckableTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5962a;
        public final boolean b;
        public final String c;

        public OnCheckableTextItem(String str, String str2, boolean z) {
            this.f5962a = str;
            this.b = z;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckableTextItem)) {
                return false;
            }
            OnCheckableTextItem onCheckableTextItem = (OnCheckableTextItem) obj;
            return Intrinsics.c(this.f5962a, onCheckableTextItem.f5962a) && this.b == onCheckableTextItem.b && Intrinsics.c(this.c, onCheckableTextItem.c);
        }

        public final int hashCode() {
            int iE = b.e(this.f5962a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(androidx.constraintlayout.core.state.a.q("OnCheckableTextItem(content=", this.f5962a, ", isRequired=", ", errorText=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnDivider;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDivider {

        /* renamed from: a, reason: collision with root package name */
        public final DividerType f5963a;

        public OnDivider(DividerType dividerType) {
            this.f5963a = dividerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDivider) && this.f5963a == ((OnDivider) obj).f5963a;
        }

        public final int hashCode() {
            return this.f5963a.hashCode();
        }

        public final String toString() {
            return "OnDivider(type=" + this.f5963a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnEverydayExtraSelectedPlan;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraSelectedPlan {

        /* renamed from: a, reason: collision with root package name */
        public final String f5964a;
        public final int b;
        public final Button c;

        public OnEverydayExtraSelectedPlan(String str, int i, Button button) {
            this.f5964a = str;
            this.b = i;
            this.c = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraSelectedPlan)) {
                return false;
            }
            OnEverydayExtraSelectedPlan onEverydayExtraSelectedPlan = (OnEverydayExtraSelectedPlan) obj;
            return Intrinsics.c(this.f5964a, onEverydayExtraSelectedPlan.f5964a) && this.b == onEverydayExtraSelectedPlan.b && Intrinsics.c(this.c, onEverydayExtraSelectedPlan.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.a(this.b, this.f5964a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sbU = b.u("OnEverydayExtraSelectedPlan(title=", this.b, this.f5964a, ", price=", ", button=");
            sbU.append(this.c);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnEverydayExtraWpayPayment;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraWpayPayment {

        /* renamed from: a, reason: collision with root package name */
        public final String f5965a;
        public final String b;
        public final String c;
        public final String d;
        public final Errors e;
        public final String f;
        public final ArrayList g;

        public OnEverydayExtraWpayPayment(String str, String str2, String str3, String str4, Errors errors, String str5, ArrayList arrayList) {
            this.f5965a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = errors;
            this.f = str5;
            this.g = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraWpayPayment)) {
                return false;
            }
            OnEverydayExtraWpayPayment onEverydayExtraWpayPayment = (OnEverydayExtraWpayPayment) obj;
            return this.f5965a.equals(onEverydayExtraWpayPayment.f5965a) && this.b.equals(onEverydayExtraWpayPayment.b) && this.c.equals(onEverydayExtraWpayPayment.c) && this.d.equals(onEverydayExtraWpayPayment.d) && this.e.equals(onEverydayExtraWpayPayment.e) && this.f.equals(onEverydayExtraWpayPayment.f) && this.g.equals(onEverydayExtraWpayPayment.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + b.c((this.e.hashCode() + b.c(b.c(b.c(this.f5965a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnEverydayExtraWpayPayment(titleIcon=", this.f5965a, ", title=", this.b, ", label=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", labelIcon=", this.d, ", errors=");
            sbV.append(this.e);
            sbV.append(", cardProvidersLabel=");
            sbV.append(this.f);
            sbV.append(", cardProviders=");
            return android.support.v4.media.session.a.q(")", sbV, this.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnParagraphTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5966a;

        public OnParagraphTextItem(String str) {
            this.f5966a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnParagraphTextItem) && Intrinsics.c(this.f5966a, ((OnParagraphTextItem) obj).f5966a);
        }

        public final int hashCode() {
            return this.f5966a.hashCode();
        }

        public final String toString() {
            return a.h("OnParagraphTextItem(content=", this.f5966a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnSmallAppIconListItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSmallAppIconListItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5967a;
        public final String b;

        public OnSmallAppIconListItem(String str, String str2) {
            this.f5967a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSmallAppIconListItem)) {
                return false;
            }
            OnSmallAppIconListItem onSmallAppIconListItem = (OnSmallAppIconListItem) obj;
            return Intrinsics.c(this.f5967a, onSmallAppIconListItem.f5967a) && Intrinsics.c(this.b, onSmallAppIconListItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5967a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnSmallAppIconListItem(iconUrl=", this.f5967a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnSubheadTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSubheadTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5968a;

        public OnSubheadTextItem(String str) {
            this.f5968a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSubheadTextItem) && Intrinsics.c(this.f5968a, ((OnSubheadTextItem) obj).f5968a);
        }

        public final int hashCode() {
            return this.f5968a.hashCode();
        }

        public final String toString() {
            return a.h("OnSubheadTextItem(content=", this.f5968a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnTitleTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5969a;

        public OnTitleTextItem(String str) {
            this.f5969a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTitleTextItem) && Intrinsics.c(this.f5969a, ((OnTitleTextItem) obj).f5969a);
        }

        public final int hashCode() {
            return this.f5969a.hashCode();
        }

        public final String toString() {
            return a.h("OnTitleTextItem(content=", this.f5969a, ")");
        }
    }

    public EverydayExtrasSummaryQuery(Optional optional, String planId) {
        Intrinsics.h(planId, "planId");
        this.f5949a = planId;
        this.b = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EverydayExtrasSummaryQuery_ResponseAdapter.Data.f6053a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query EverydayExtrasSummary($planId: ID!, $acquisitionOfferName: String) { everydayExtraSummary(planId: $planId, acquisitionOfferName: $acquisitionOfferName) { navigationTitle content { id contentItems: items { __typename ... on TitleTextItem { content } ... on CheckableTextItem { content isRequired errorText } ... on SubheadTextItem { content } ... on ParagraphTextItem { content } ... on Divider { type } ... on EverydayExtraWpayPayment { titleIcon title label labelIcon errors { __typename cardErrors { title errorItems: items { domId key value } } externalSystemError { __typename title value } } cardProvidersLabel cardProviders { altText iconUrl } } ... on EverydayExtraSelectedPlan { title price button { action style label } } ... on SmallAppIconListItem { iconUrl label } } } footer { id footerItems: items { label action style } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasSummaryQuery)) {
            return false;
        }
        EverydayExtrasSummaryQuery everydayExtrasSummaryQuery = (EverydayExtrasSummaryQuery) obj;
        return Intrinsics.c(this.f5949a, everydayExtrasSummaryQuery.f5949a) && Intrinsics.c(this.b, everydayExtrasSummaryQuery.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5949a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a9bf9f3bad2b8fc07a95f2a20f6607fbb3c8a0ed409c3b50c7c1c7e9d81f16b0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EverydayExtrasSummary";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("planId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f5949a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("acquisitionOfferName");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "EverydayExtrasSummaryQuery(planId=" + this.f5949a + ", acquisitionOfferName=" + this.b + ")";
    }
}
