package au.com.woolworths.android.onesite.di;

import android.app.Application;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumConfigData;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.UtilsKt;
import coil3.request.ErrorResult;
import coil3.request.NullRequestDataException;
import com.tealium.core.Tealium;
import com.tealium.remotecommanddispatcher.RemoteCommandDispatcher;
import com.tealium.remotecommanddispatcher.RemoteCommandDispatcherKt;
import com.tealium.remotecommands.branch.BranchRemoteCommand;
import com.tealium.remotecommands.firebase.FirebaseRemoteCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RemoteCommandDispatcher remoteCommandDispatcherA;
        RemoteCommandDispatcher remoteCommandDispatcherA2;
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                FeatureToggleManager featureToggleManager = (FeatureToggleManager) obj4;
                Application application = (Application) obj3;
                TealiumConfigData tealiumConfigData = (TealiumConfigData) obj2;
                Tealium create = (Tealium) obj;
                Intrinsics.h(create, "$this$create");
                if (featureToggleManager.c(BaseFeature.n) && (remoteCommandDispatcherA2 = RemoteCommandDispatcherKt.a(create)) != null) {
                    RemoteCommandDispatcher.E(remoteCommandDispatcherA2, new FirebaseRemoteCommand(application));
                }
                AppEnvironment.Production production = AppEnvironment.Production.INSTANCE;
                String string = null;
                if (Intrinsics.c(production, production)) {
                    Integer num = tealiumConfigData.f;
                    if (num != null) {
                        string = application.getString(num.intValue());
                    }
                } else {
                    Integer num2 = tealiumConfigData.g;
                    if (num2 != null) {
                        string = application.getString(num2.intValue());
                    }
                }
                if (featureToggleManager.c(BaseFeature.m) && string != null && (remoteCommandDispatcherA = RemoteCommandDispatcherKt.a(create)) != null) {
                    RemoteCommandDispatcher.E(remoteCommandDispatcherA, new BranchRemoteCommand(application, string));
                }
                return unit;
            case 1:
                Painter painter = (Painter) obj4;
                Painter painter2 = (Painter) obj3;
                Painter painter3 = (Painter) obj2;
                AsyncImagePainter.State state = (AsyncImagePainter.State) obj;
                CoroutineDispatcher coroutineDispatcher = UtilsKt.f13070a;
                if (state instanceof AsyncImagePainter.State.Loading) {
                    return painter != null ? new AsyncImagePainter.State.Loading(painter) : (AsyncImagePainter.State.Loading) state;
                }
                if (!(state instanceof AsyncImagePainter.State.Error)) {
                    return state;
                }
                AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
                ErrorResult errorResult = error.b;
                return errorResult.getC() instanceof NullRequestDataException ? painter2 != null ? new AsyncImagePainter.State.Error(painter2, errorResult) : error : painter3 != null ? new AsyncImagePainter.State.Error(painter3, errorResult) : error;
            default:
                Function1 function1 = (Function1) obj4;
                Function1 function12 = (Function1) obj3;
                Function1 function13 = (Function1) obj2;
                AsyncImagePainter.State state2 = (AsyncImagePainter.State) obj;
                CoroutineDispatcher coroutineDispatcher2 = UtilsKt.f13070a;
                if (state2 instanceof AsyncImagePainter.State.Loading) {
                    if (function1 != null) {
                        function1.invoke(state2);
                    }
                } else if (state2 instanceof AsyncImagePainter.State.Success) {
                    if (function12 != null) {
                        function12.invoke(state2);
                    }
                } else if (state2 instanceof AsyncImagePainter.State.Error) {
                    if (function13 != null) {
                        function13.invoke(state2);
                    }
                } else if (!(state2 instanceof AsyncImagePainter.State.Empty)) {
                    throw new NoWhenBranchMatchedException();
                }
                return unit;
        }
    }

    public /* synthetic */ a(FeatureToggleManager featureToggleManager, Application application, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, TealiumConfigData tealiumConfigData) {
        this.d = 0;
        this.e = featureToggleManager;
        this.f = application;
        this.g = tealiumConfigData;
    }
}
