package au.com.woolworths.feature.shop.video;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.recipes.recipedetails.RecipeDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class FullPageVideoPlayerActivity$onCreate$2$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FullPageVideoPlayerViewModel fullPageVideoPlayerViewModel = (FullPageVideoPlayerViewModel) this.receiver;
        AnalyticsManager analyticsManager = fullPageVideoPlayerViewModel.e;
        RecipeDetailsAnalytics.RecipeDetails.Action.Companion companion = RecipeDetailsAnalytics.RecipeDetails.Action.d;
        VideoData videoData = fullPageVideoPlayerViewModel.i;
        if (videoData == null) {
            Intrinsics.p("videoData");
            throw null;
        }
        final String id = videoData.getId();
        if (id == null) {
            id = "";
        }
        VideoData videoData2 = fullPageVideoPlayerViewModel.i;
        if (videoData2 == null) {
            Intrinsics.p("videoData");
            throw null;
        }
        final String videoLength = videoData2.getDuration();
        VideoData videoData3 = fullPageVideoPlayerViewModel.i;
        if (videoData3 == null) {
            Intrinsics.p("videoData");
            throw null;
        }
        final String videoName = videoData3.getTitle();
        companion.getClass();
        Intrinsics.h(videoLength, "videoLength");
        Intrinsics.h(videoName, "videoName");
        analyticsManager.g(new Event(id, videoLength, videoName) { // from class: au.com.woolworths.analytics.supers.recipes.recipedetails.RecipeDetailsAnalytics$RecipeDetails$Action$Companion$videoStart$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                spreadBuilder.b(RecipeDetailsAnalytics.RecipeDetails.e);
                spreadBuilder.a(new Pair("event.Category", "videos"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "video start"));
                spreadBuilder.a(new Pair("video.ID", id));
                a.z("video.Length", videoLength, spreadBuilder, "video.Name", videoName);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "videos_start";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "videos_start".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        return Unit.f24250a;
    }
}
