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
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.video.FullPageVideoPlayerViewModel$trackVideoProgressJob$1", f = "FullPageVideoPlayerViewModel.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FullPageVideoPlayerViewModel$trackVideoProgressJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public float p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ FullPageVideoPlayerViewModel v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullPageVideoPlayerViewModel$trackVideoProgressJob$1(long j, long j2, FullPageVideoPlayerViewModel fullPageVideoPlayerViewModel, Continuation continuation) {
        super(2, continuation);
        this.t = j;
        this.u = j2;
        this.v = fullPageVideoPlayerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FullPageVideoPlayerViewModel$trackVideoProgressJob$1 fullPageVideoPlayerViewModel$trackVideoProgressJob$1 = new FullPageVideoPlayerViewModel$trackVideoProgressJob$1(this.t, this.u, this.v, continuation);
        fullPageVideoPlayerViewModel$trackVideoProgressJob$1.s = obj;
        return fullPageVideoPlayerViewModel$trackVideoProgressJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FullPageVideoPlayerViewModel$trackVideoProgressJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        long j;
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        long j2 = this.u;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.s;
            f = this.t;
            j = j2 / 10;
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.q;
            f = this.p;
            coroutineScope = (CoroutineScope) this.s;
            ResultKt.b(obj);
        }
        do {
            float f2 = j2;
            if (f > f2) {
                CoroutineScopeKt.b(coroutineScope, null);
                return Unit.f24250a;
            }
            if (MathKt.b((f / f2) * 100.0f) == 90) {
                FullPageVideoPlayerViewModel fullPageVideoPlayerViewModel = this.v;
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
                analyticsManager.g(new Event(id, videoLength, videoName) { // from class: au.com.woolworths.analytics.supers.recipes.recipedetails.RecipeDetailsAnalytics$RecipeDetails$Action$Companion$videoMilestone90Percent$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                        spreadBuilder.b(RecipeDetailsAnalytics.RecipeDetails.e);
                        spreadBuilder.a(new Pair("event.Category", "videos"));
                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                        spreadBuilder.a(new Pair("event.Label", "Video Milestone 90"));
                        spreadBuilder.a(new Pair("video.ID", id));
                        a.z("video.Length", videoLength, spreadBuilder, "video.Name", videoName);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "videos_milestone90";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "videos_milestone90".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
            f += j;
            this.s = coroutineScope;
            this.p = f;
            this.q = j;
            this.r = 1;
        } while (DelayKt.b(j, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
