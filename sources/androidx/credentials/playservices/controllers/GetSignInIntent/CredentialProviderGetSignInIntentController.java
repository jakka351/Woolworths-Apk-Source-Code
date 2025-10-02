package androidx.credentials.playservices.controllers.GetSignInIntent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001d\b\u0000\u0018\u0000 .2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001.B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0017J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0004H\u0014J\u0010\u0010#\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u0004H\u0007J'\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0002\b,J6\u0010-\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R0\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006/"}, d2 = {"Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/GetCredentialRequest;", "Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callback", "Landroidx/credentials/CredentialManagerCallback;", "getCallback$annotations", "()V", "getCallback", "()Landroidx/credentials/CredentialManagerCallback;", "setCallback", "(Landroidx/credentials/CredentialManagerCallback;)V", "cancellationSignal", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "executor", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "resultReceiver", "androidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$resultReceiver$1", "Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$resultReceiver$1;", "convertRequestToPlayServices", "request", "convertResponseToCredentialManager", "response", "createGoogleIdCredential", "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "handleResponse", "", "uniqueRequestCode", "", "resultCode", "data", "Landroid/content/Intent;", "handleResponse$credentials_play_services_auth_release", "invokePlayServices", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController<GetCredentialRequest, GetSignInIntentRequest, SignInCredential, GetCredentialResponse, GetCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "GetSignInIntent";

    @Nullable
    private static CredentialProviderGetSignInIntentController controller;
    public CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    public Executor executor;

    @NotNull
    private final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$Companion;", "", "()V", "TAG", "", "controller", "Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;", "getInstance", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CredentialProviderGetSignInIntentController getInstance(@NotNull Context context) {
            Intrinsics.h(context, "context");
            if (CredentialProviderGetSignInIntentController.controller == null) {
                CredentialProviderGetSignInIntentController.controller = new CredentialProviderGetSignInIntentController(context);
            }
            CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.controller;
            Intrinsics.e(credentialProviderGetSignInIntentController);
            return credentialProviderGetSignInIntentController;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Exception $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Exception exc) {
            super(0);
            this.$e = exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, Exception e) {
            Intrinsics.h(this$0, "this$0");
            Intrinsics.h(e, "$e");
            this$0.getCallback().a(e);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m41invoke();
            return Unit.f24250a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m41invoke() {
            CredentialProviderGetSignInIntentController.this.getExecutor().execute(new b(CredentialProviderGetSignInIntentController.this, this.$e, 3));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$2, reason: invalid class name */
    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0) {
            Intrinsics.h(this$0, "this$0");
            this$0.getCallback().a(new GetCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m43invoke();
            return Unit.f24250a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m43invoke() {
            Executor executor = CredentialProviderGetSignInIntentController.this.getExecutor();
            final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.c
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderGetSignInIntentController.AnonymousClass2.invoke$lambda$0(credentialProviderGetSignInIntentController);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, @NotNull Bundle resultData) {
                Intrinsics.h(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    @VisibleForTesting
    public static /* synthetic */ void getCallback$annotations() {
    }

    @VisibleForTesting
    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExecutor$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final CredentialProviderGetSignInIntentController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    @VisibleForTesting
    @NotNull
    public final GoogleIdTokenCredential createGoogleIdCredential(@NotNull SignInCredential response) throws GetCredentialUnknownException {
        Intrinsics.h(response, "response");
        GoogleIdTokenCredential.Builder builder = new GoogleIdTokenCredential.Builder();
        String id = response.getId();
        Intrinsics.g(id, "response.id");
        builder.f14502a = id;
        try {
            String googleIdToken = response.getGoogleIdToken();
            Intrinsics.e(googleIdToken);
            builder.b = googleIdToken;
            if (response.getDisplayName() != null) {
                builder.c = response.getDisplayName();
            }
            if (response.getGivenName() != null) {
                builder.e = response.getGivenName();
            }
            if (response.getFamilyName() != null) {
                builder.d = response.getFamilyName();
            }
            if (response.getPhoneNumber() != null) {
                builder.g = response.getPhoneNumber();
            }
            if (response.getProfilePictureUri() != null) {
                builder.f = response.getProfilePictureUri();
            }
            String str = builder.f14502a;
            String str2 = builder.b;
            String str3 = builder.c;
            String str4 = builder.d;
            String str5 = builder.e;
            Uri uri = builder.f;
            String str6 = builder.g;
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
            bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
            GoogleIdTokenCredential googleIdTokenCredential = new GoogleIdTokenCredential();
            if (str.length() <= 0) {
                throw new IllegalArgumentException("id should not be empty");
            }
            if (str2.length() > 0) {
                return googleIdTokenCredential;
            }
            throw new IllegalArgumentException("idToken should not be empty");
        } catch (Exception unused) {
            throw new GetCredentialUnknownException("When attempting to convert get response, null Google ID Token found");
        }
    }

    @NotNull
    public final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> getCallback() {
        CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback = this.callback;
        if (credentialManagerCallback != null) {
            return credentialManagerCallback;
        }
        Intrinsics.p("callback");
        throw null;
    }

    @NotNull
    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.p("executor");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(resultCode, new Function2<CancellationSignal, Function0<? extends Unit>, Unit>() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CancellationSignal) obj, (Function0<Unit>) obj2);
                return Unit.f24250a;
            }

            public final void invoke(@Nullable CancellationSignal cancellationSignal, @NotNull Function0<Unit> f) {
                Intrinsics.h(f, "f");
                CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, f);
            }
        }, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.context).getSignInCredentialFromIntent(data);
            Intrinsics.g(signInCredentialFromIntent, "getSignInClient(context)…redentialFromIntent(data)");
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(signInCredentialFromIntent)));
        } catch (GetCredentialException e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$5(this, e));
        } catch (ApiException e2) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.d = new GetCredentialUnknownException(e2.getMessage());
            if (e2.getStatusCode() == 16) {
                objectRef.d = new GetCredentialCancellationException(e2.getMessage());
            } else if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(e2.getStatusCode()))) {
                objectRef.d = new GetCredentialInterruptedException(e2.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, objectRef));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$6(this, new GetCredentialUnknownException(th.getMessage())));
        }
    }

    public final void setCallback(@NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        Intrinsics.h(credentialManagerCallback, "<set-?>");
        this.callback = credentialManagerCallback;
    }

    public final void setExecutor(@NotNull Executor executor) {
        Intrinsics.h(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @VisibleForTesting
    @NotNull
    public GetSignInIntentRequest convertRequestToPlayServices(@NotNull GetCredentialRequest request) {
        Intrinsics.h(request, "request");
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public GetCredentialResponse convertResponseToCredentialManager(@NotNull SignInCredential response) throws GetCredentialUnknownException {
        GoogleIdTokenCredential googleIdTokenCredentialCreateGoogleIdCredential;
        Intrinsics.h(response, "response");
        if (response.getGoogleIdToken() != null) {
            googleIdTokenCredentialCreateGoogleIdCredential = createGoogleIdCredential(response);
        } else {
            Log.w(TAG, "Credential returned but no google Id found");
            googleIdTokenCredentialCreateGoogleIdCredential = null;
        }
        if (googleIdTokenCredentialCreateGoogleIdCredential != null) {
            return new GetCredentialResponse();
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull GetCredentialRequest request, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback, @NotNull Executor executor, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.h(request, "request");
        Intrinsics.h(callback, "callback");
        Intrinsics.h(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        try {
            GetSignInIntentRequest getSignInIntentRequestConvertRequestToPlayServices = convertRequestToPlayServices(request);
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, getSignInIntentRequestConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.SIGN_IN_INTENT_TAG);
            this.context.startActivity(intent);
        } catch (Exception e) {
            if (e instanceof GetCredentialUnsupportedException) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(e));
            } else {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2());
            }
        }
    }
}
