package au.com.woolworths.feature.rewards.everydayextras.signup.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasFinalGlanceQuery;
import au.com.woolworths.rewards.graphql.type.EverydayExtraButtonStyle;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter;", "", "Data", "EverydayExtraFinalGlance", "Feed", "OnTitleTextItem", "OnTimelineBreakdown", "Item", "OnNoteTextItem", "OnEverydayExtraButton", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasFinalGlanceQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<EverydayExtrasFinalGlanceQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f5998a = new Data();
        public static final List b = CollectionsKt.Q("everydayExtraFinalGlance");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtrasFinalGlanceQuery.EverydayExtraFinalGlance everydayExtraFinalGlance = null;
            while (reader.o2(b) == 0) {
                everydayExtraFinalGlance = (EverydayExtrasFinalGlanceQuery.EverydayExtraFinalGlance) Adapters.b(Adapters.c(EverydayExtraFinalGlance.f5999a, false)).fromJson(reader, customScalarAdapters);
            }
            return new EverydayExtrasFinalGlanceQuery.Data(everydayExtraFinalGlance);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasFinalGlanceQuery.Data value = (EverydayExtrasFinalGlanceQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("everydayExtraFinalGlance");
            Adapters.b(Adapters.c(EverydayExtraFinalGlance.f5999a, false)).toJson(writer, customScalarAdapters, value.f5880a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter$EverydayExtraFinalGlance;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$EverydayExtraFinalGlance;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EverydayExtraFinalGlance implements Adapter<EverydayExtrasFinalGlanceQuery.EverydayExtraFinalGlance> {

        /* renamed from: a, reason: collision with root package name */
        public static final EverydayExtraFinalGlance f5999a = new EverydayExtraFinalGlance();
        public static final List b = CollectionsKt.Q("feed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Feed.f6000a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasFinalGlanceQuery.EverydayExtraFinalGlance(arrayListFromJson);
            }
            Assertions.a(reader, "feed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasFinalGlanceQuery.EverydayExtraFinalGlance value = (EverydayExtrasFinalGlanceQuery.EverydayExtraFinalGlance) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("feed");
            Adapters.a(Adapters.c(Feed.f6000a, true)).toJson(writer, customScalarAdapters, value.f5881a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$Feed;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<EverydayExtrasFinalGlanceQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f6000a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasFinalGlanceQuery.OnTitleTextItem onTitleTextItemA;
            EverydayExtrasFinalGlanceQuery.OnTimelineBreakdown onTimelineBreakdownA;
            EverydayExtrasFinalGlanceQuery.OnNoteTextItem onNoteTextItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasFinalGlanceQuery.OnEverydayExtraButton onEverydayExtraButtonA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TitleTextItem"))) {
                reader.o();
                onTitleTextItemA = OnTitleTextItem.a(reader, customScalarAdapters);
            } else {
                onTitleTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TimelineBreakdown"))) {
                reader.o();
                onTimelineBreakdownA = OnTimelineBreakdown.a(reader, customScalarAdapters);
            } else {
                onTimelineBreakdownA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("NoteTextItem"))) {
                reader.o();
                onNoteTextItemA = OnNoteTextItem.a(reader, customScalarAdapters);
            } else {
                onNoteTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraButton"))) {
                reader.o();
                onEverydayExtraButtonA = OnEverydayExtraButton.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasFinalGlanceQuery.Feed(str, onTitleTextItemA, onTimelineBreakdownA, onNoteTextItemA, onEverydayExtraButtonA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasFinalGlanceQuery.Feed value = (EverydayExtrasFinalGlanceQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5882a);
            EverydayExtrasFinalGlanceQuery.OnTitleTextItem onTitleTextItem = value.b;
            if (onTitleTextItem != null) {
                OnTitleTextItem.b(writer, customScalarAdapters, onTitleTextItem);
            }
            EverydayExtrasFinalGlanceQuery.OnTimelineBreakdown onTimelineBreakdown = value.c;
            if (onTimelineBreakdown != null) {
                OnTimelineBreakdown.b(writer, customScalarAdapters, onTimelineBreakdown);
            }
            EverydayExtrasFinalGlanceQuery.OnNoteTextItem onNoteTextItem = value.d;
            if (onNoteTextItem != null) {
                OnNoteTextItem.b(writer, customScalarAdapters, onNoteTextItem);
            }
            EverydayExtrasFinalGlanceQuery.OnEverydayExtraButton onEverydayExtraButton = value.e;
            if (onEverydayExtraButton != null) {
                OnEverydayExtraButton.b(writer, customScalarAdapters, onEverydayExtraButton);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$Item;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<EverydayExtrasFinalGlanceQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f6001a = new Item();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "iconUrl", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str4 != null) {
                return new EverydayExtrasFinalGlanceQuery.Item(str, str2, str3, str4);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasFinalGlanceQuery.Item value = (EverydayExtrasFinalGlanceQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5883a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter$OnEverydayExtraButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$OnEverydayExtraButton;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraButton implements Adapter<EverydayExtrasFinalGlanceQuery.OnEverydayExtraButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6002a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "actionUrl", "style");

        public static EverydayExtrasFinalGlanceQuery.OnEverydayExtraButton a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            EverydayExtraButtonStyle everydayExtraButtonStyle = null;
            while (true) {
                int iO2 = reader.o2(f6002a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    everydayExtraButtonStyle = (EverydayExtraButtonStyle) Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasFinalGlanceQuery.OnEverydayExtraButton(str, str2, str3, everydayExtraButtonStyle);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasFinalGlanceQuery.OnEverydayExtraButton value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5884a);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("actionUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("style");
            Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasFinalGlanceQuery.OnEverydayExtraButton) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter$OnNoteTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$OnNoteTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnNoteTextItem implements Adapter<EverydayExtrasFinalGlanceQuery.OnNoteTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6003a = CollectionsKt.Q("content");

        public static EverydayExtrasFinalGlanceQuery.OnNoteTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f6003a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EverydayExtrasFinalGlanceQuery.OnNoteTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasFinalGlanceQuery.OnNoteTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5885a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasFinalGlanceQuery.OnNoteTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter$OnTimelineBreakdown;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$OnTimelineBreakdown;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTimelineBreakdown implements Adapter<EverydayExtrasFinalGlanceQuery.OnTimelineBreakdown> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6004a = CollectionsKt.Q("items");

        public static EverydayExtrasFinalGlanceQuery.OnTimelineBreakdown a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f6004a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f6001a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasFinalGlanceQuery.OnTimelineBreakdown(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasFinalGlanceQuery.OnTimelineBreakdown value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f6001a, false)).toJson(writer, customScalarAdapters, value.f5886a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasFinalGlanceQuery.OnTimelineBreakdown) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasFinalGlanceQuery_ResponseAdapter$OnTitleTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasFinalGlanceQuery$OnTitleTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleTextItem implements Adapter<EverydayExtrasFinalGlanceQuery.OnTitleTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6005a = CollectionsKt.Q("content");

        public static EverydayExtrasFinalGlanceQuery.OnTitleTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f6005a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EverydayExtrasFinalGlanceQuery.OnTitleTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasFinalGlanceQuery.OnTitleTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5887a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasFinalGlanceQuery.OnTitleTextItem) obj);
        }
    }
}
