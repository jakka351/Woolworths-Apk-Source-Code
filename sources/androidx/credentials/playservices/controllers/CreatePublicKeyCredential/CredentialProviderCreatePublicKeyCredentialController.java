package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.internal.RequestValidationHelper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0015\b\u0000\u0018\u0000 (2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001(B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0017J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0004H\u0017J'\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0002\b&J6\u0010'\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b8\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\u00020\u00128\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\rR\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006)"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/CreatePublicKeyCredentialRequest;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callback", "Landroidx/credentials/CredentialManagerCallback;", "getCallback$annotations", "()V", "cancellationSignal", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "executor", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "resultReceiver", "androidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "JSONExceptionToPKCError", "Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "exception", "Lorg/json/JSONException;", "convertRequestToPlayServices", "request", "convertResponseToCredentialManager", "response", "handleResponse", "", "uniqueRequestCode", "", "resultCode", "data", "Landroid/content/Intent;", "handleResponse$credentials_play_services_auth_release", "invokePlayServices", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<CreatePublicKeyCredentialRequest, PublicKeyCredentialCreationOptions, PublicKeyCredential, CreateCredentialResponse, CreateCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "CreatePublicKey";

    @Nullable
    private static CredentialProviderCreatePublicKeyCredentialController controller;
    private CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    private Executor executor;

    @NotNull
    private final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;", "", "()V", "TAG", "", "controller", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "getInstance", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(@NotNull Context context) {
            Intrinsics.h(context, "context");
            if (CredentialProviderCreatePublicKeyCredentialController.controller == null) {
                CredentialProviderCreatePublicKeyCredentialController.controller = new CredentialProviderCreatePublicKeyCredentialController(context);
            }
            CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.controller;
            Intrinsics.e(credentialProviderCreatePublicKeyCredentialController);
            return credentialProviderCreatePublicKeyCredentialController;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ JSONException $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONException jSONException) {
            super(0);
            this.$e = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e) {
            Intrinsics.h(this$0, "this$0");
            Intrinsics.h(e, "$e");
            CredentialManagerCallback credentialManagerCallback = this$0.callback;
            if (credentialManagerCallback != null) {
                credentialManagerCallback.a(this$0.JSONExceptionToPKCError(e));
                throw null;
            }
            Intrinsics.p("callback");
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m28invoke();
            return Unit.f24250a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m28invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor != null) {
                executor.execute(new b(CredentialProviderCreatePublicKeyCredentialController.this, this.$e, 1));
            } else {
                Intrinsics.p("executor");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2, reason: invalid class name */
    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Throwable $t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Throwable th) {
            super(0);
            this.$t = th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, Throwable t) {
            Intrinsics.h(this$0, "this$0");
            Intrinsics.h(t, "$t");
            CredentialManagerCallback credentialManagerCallback = this$0.callback;
            if (credentialManagerCallback != null) {
                credentialManagerCallback.a(new CreateCredentialUnknownException(t.getMessage()));
                throw null;
            }
            Intrinsics.p("callback");
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m29invoke();
            return Unit.f24250a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m29invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor != null) {
                executor.execute(new c(CredentialProviderCreatePublicKeyCredentialController.this, this.$t, 1));
            } else {
                Intrinsics.p("executor");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3, reason: invalid class name */
    public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        public AnonymousClass3() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
            Intrinsics.h(this$0, "this$0");
            CredentialManagerCallback credentialManagerCallback = this$0.callback;
            if (credentialManagerCallback != null) {
                credentialManagerCallback.a(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
                throw null;
            }
            Intrinsics.p("callback");
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m30invoke();
            return Unit.f24250a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m30invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor != null) {
                executor.execute(new d(CredentialProviderCreatePublicKeyCredentialController.this, 0));
            } else {
                Intrinsics.p("executor");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, @NotNull Bundle resultData) {
                Intrinsics.h(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    Intrinsics.p("executor");
                    throw null;
                }
                CredentialManagerCallback credentialManagerCallback = this.this$0.callback;
                if (credentialManagerCallback == null) {
                    Intrinsics.p("callback");
                    throw null;
                }
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, credentialManagerCallback, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatePublicKeyCredentialDomException JSONExceptionToPKCError(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new EncodingError(), "Unknown error") : new CreatePublicKeyCredentialDomException(new EncodingError(), message);
    }

    @VisibleForTesting
    private static /* synthetic */ void getCallback$annotations() {
    }

    @VisibleForTesting
    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    @VisibleForTesting
    private static /* synthetic */ void getExecutor$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
        Intrinsics.h(this$0, "this$0");
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = this$0.callback;
        if (credentialManagerCallback != null) {
            credentialManagerCallback.a(new CreatePublicKeyCredentialDomException(new UnknownError(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
            throw null;
        }
        Intrinsics.p("callback");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new Function2<CancellationSignal, Function0<? extends Unit>, Unit>() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$1
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
        }, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra(Fido.FIDO2_KEY_CREDENTIAL_EXTRA) : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new d(this, 1));
                return;
            } else {
                Intrinsics.p("executor");
                throw null;
            }
        }
        PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        Intrinsics.g(publicKeyCredentialDeserializeFromBytes, "deserializeFromBytes(bytes)");
        CreateCredentialException createCredentialExceptionPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.INSTANCE.publicKeyCredentialResponseContainsError(publicKeyCredentialDeserializeFromBytes);
        if (createCredentialExceptionPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, createCredentialExceptionPublicKeyCredentialResponseContainsError));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(publicKeyCredentialDeserializeFromBytes)));
        } catch (JSONException e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @VisibleForTesting
    @NotNull
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(@NotNull CreatePublicKeyCredentialRequest request) {
        Intrinsics.h(request, "request");
        return PublicKeyCredentialControllerUtility.INSTANCE.convert(request);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @VisibleForTesting
    @NotNull
    public CreateCredentialResponse convertResponseToCredentialManager(@NotNull PublicKeyCredential response) throws CreateCredentialUnknownException {
        Intrinsics.h(response, "response");
        try {
            String json = response.toJson();
            Intrinsics.g(json, "response.toJson()");
            new Bundle().putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", json);
            CreatePublicKeyCredentialResponse createPublicKeyCredentialResponse = new CreatePublicKeyCredentialResponse();
            if (RequestValidationHelper.Companion.a(json)) {
                return createPublicKeyCredentialResponse;
            }
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        } catch (Throwable th) {
            throw new CreateCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull CreatePublicKeyCredentialRequest request, @NotNull CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback, @NotNull Executor executor, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.h(request, "request");
        Intrinsics.h(callback, "callback");
        Intrinsics.h(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsConvertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, publicKeyCredentialCreationOptionsConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass3());
            }
        } catch (JSONException e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(e));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2(th));
        }
    }
}
