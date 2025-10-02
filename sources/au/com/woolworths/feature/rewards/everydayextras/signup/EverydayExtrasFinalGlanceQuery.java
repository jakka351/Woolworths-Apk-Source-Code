package au.com.woolworths.feature.rewards.everydayextras.signup;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.rewards.everydayextras.signup.adapter.EverydayExtrasFinalGlanceQuery_ResponseAdapter;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$Data;", "Data", "EverydayExtraFinalGlance", "Feed", "OnTitleTextItem", "OnTimelineBreakdown", "Item", "OnNoteTextItem", "OnEverydayExtraButton", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasFinalGlanceQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f5879a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EverydayExtraFinalGlance f5880a;

        public Data(EverydayExtraFinalGlance everydayExtraFinalGlance) {
            this.f5880a = everydayExtraFinalGlance;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f5880a, ((Data) obj).f5880a);
        }

        public final int hashCode() {
            EverydayExtraFinalGlance everydayExtraFinalGlance = this.f5880a;
            if (everydayExtraFinalGlance == null) {
                return 0;
            }
            return everydayExtraFinalGlance.f5881a.hashCode();
        }

        public final String toString() {
            return "Data(everydayExtraFinalGlance=" + this.f5880a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$EverydayExtraFinalGlance;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtraFinalGlance {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f5881a;

        public EverydayExtraFinalGlance(ArrayList arrayList) {
            this.f5881a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EverydayExtraFinalGlance) && this.f5881a.equals(((EverydayExtraFinalGlance) obj).f5881a);
        }

        public final int hashCode() {
            return this.f5881a.hashCode();
        }

        public final String toString() {
            return a.k("EverydayExtraFinalGlance(feed=", ")", this.f5881a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$Feed;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f5882a;
        public final OnTitleTextItem b;
        public final OnTimelineBreakdown c;
        public final OnNoteTextItem d;
        public final OnEverydayExtraButton e;

        public Feed(String __typename, OnTitleTextItem onTitleTextItem, OnTimelineBreakdown onTimelineBreakdown, OnNoteTextItem onNoteTextItem, OnEverydayExtraButton onEverydayExtraButton) {
            Intrinsics.h(__typename, "__typename");
            this.f5882a = __typename;
            this.b = onTitleTextItem;
            this.c = onTimelineBreakdown;
            this.d = onNoteTextItem;
            this.e = onEverydayExtraButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f5882a, feed.f5882a) && Intrinsics.c(this.b, feed.b) && Intrinsics.c(this.c, feed.c) && Intrinsics.c(this.d, feed.d) && Intrinsics.c(this.e, feed.e);
        }

        public final int hashCode() {
            int iHashCode = this.f5882a.hashCode() * 31;
            OnTitleTextItem onTitleTextItem = this.b;
            int iHashCode2 = (iHashCode + (onTitleTextItem == null ? 0 : onTitleTextItem.f5887a.hashCode())) * 31;
            OnTimelineBreakdown onTimelineBreakdown = this.c;
            int iHashCode3 = (iHashCode2 + (onTimelineBreakdown == null ? 0 : onTimelineBreakdown.f5886a.hashCode())) * 31;
            OnNoteTextItem onNoteTextItem = this.d;
            int iHashCode4 = (iHashCode3 + (onNoteTextItem == null ? 0 : onNoteTextItem.f5885a.hashCode())) * 31;
            OnEverydayExtraButton onEverydayExtraButton = this.e;
            return iHashCode4 + (onEverydayExtraButton != null ? onEverydayExtraButton.hashCode() : 0);
        }

        public final String toString() {
            return "Feed(__typename=" + this.f5882a + ", onTitleTextItem=" + this.b + ", onTimelineBreakdown=" + this.c + ", onNoteTextItem=" + this.d + ", onEverydayExtraButton=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$Item;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f5883a;
        public final String b;
        public final String c;
        public final String d;

        public Item(String str, String str2, String str3, String str4) {
            this.f5883a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f5883a, item.f5883a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            String str = this.f5883a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.d.hashCode() + b.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(YU.a.v("Item(title=", this.f5883a, ", description=", this.b, ", iconUrl="), this.c, ", altText=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$OnEverydayExtraButton;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f5884a;
        public final String b;
        public final String c;
        public final EverydayExtraButtonStyle d;

        public OnEverydayExtraButton(String str, String str2, String str3, EverydayExtraButtonStyle everydayExtraButtonStyle) {
            this.f5884a = str;
            this.b = str2;
            this.c = str3;
            this.d = everydayExtraButtonStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraButton)) {
                return false;
            }
            OnEverydayExtraButton onEverydayExtraButton = (OnEverydayExtraButton) obj;
            return Intrinsics.c(this.f5884a, onEverydayExtraButton.f5884a) && Intrinsics.c(this.b, onEverydayExtraButton.b) && Intrinsics.c(this.c, onEverydayExtraButton.c) && this.d == onEverydayExtraButton.d;
        }

        public final int hashCode() {
            int iC = b.c(this.f5884a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            EverydayExtraButtonStyle everydayExtraButtonStyle = this.d;
            return iHashCode + (everydayExtraButtonStyle != null ? everydayExtraButtonStyle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnEverydayExtraButton(label=", this.f5884a, ", action=", this.b, ", actionUrl=");
            sbV.append(this.c);
            sbV.append(", style=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$OnNoteTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNoteTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5885a;

        public OnNoteTextItem(String str) {
            this.f5885a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnNoteTextItem) && Intrinsics.c(this.f5885a, ((OnNoteTextItem) obj).f5885a);
        }

        public final int hashCode() {
            return this.f5885a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnNoteTextItem(content=", this.f5885a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$OnTimelineBreakdown;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTimelineBreakdown {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f5886a;

        public OnTimelineBreakdown(ArrayList arrayList) {
            this.f5886a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTimelineBreakdown) && this.f5886a.equals(((OnTimelineBreakdown) obj).f5886a);
        }

        public final int hashCode() {
            return this.f5886a.hashCode();
        }

        public final String toString() {
            return a.k("OnTimelineBreakdown(items=", ")", this.f5886a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$OnTitleTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5887a;

        public OnTitleTextItem(String str) {
            this.f5887a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTitleTextItem) && Intrinsics.c(this.f5887a, ((OnTitleTextItem) obj).f5887a);
        }

        public final int hashCode() {
            return this.f5887a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnTitleTextItem(content=", this.f5887a, ")");
        }
    }

    public EverydayExtrasFinalGlanceQuery(Optional.Present present) {
        this.f5879a = present;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EverydayExtrasFinalGlanceQuery_ResponseAdapter.Data.f5998a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query EverydayExtrasFinalGlance($acquisitionOfferName: String) { everydayExtraFinalGlance(acquisitionOfferName: $acquisitionOfferName) { feed { __typename ... on TitleTextItem { content } ... on TimelineBreakdown { items { title description iconUrl altText } } ... on NoteTextItem { content } ... on EverydayExtraButton { label action actionUrl style } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EverydayExtrasFinalGlanceQuery) && this.f5879a.equals(((EverydayExtrasFinalGlanceQuery) obj).f5879a);
    }

    public final int hashCode() {
        return this.f5879a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "7095d37cf7941346757d6312830aa4d90b822afbe93ba64c4481d4a7adfb9fe7";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EverydayExtrasFinalGlance";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("acquisitionOfferName");
        Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, this.f5879a);
    }

    public final String toString() {
        return "EverydayExtrasFinalGlanceQuery(acquisitionOfferName=" + this.f5879a + ")";
    }
}
