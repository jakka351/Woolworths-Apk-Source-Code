package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import com.braintreepayments.api.Authorization;
import com.braintreepayments.api.AuthorizationCallback;
import com.braintreepayments.api.BraintreeClient;
import com.braintreepayments.api.BraintreeException;
import com.braintreepayments.api.ConfigurationCallback;
import com.braintreepayments.api.HttpResponseCallback;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements PlatformTextInputMethodRequest, AuthorizationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1176a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, Function1 function1, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration) {
        this.f1176a = transformedTextFieldState;
        this.b = composeInputMethodManager;
        this.c = function1;
        this.d = function0;
        this.e = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public InputConnection a(EditorInfo editorInfo) {
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) this.f1176a;
        new DefaultImeEditCommandScope(transformedTextFieldState);
        transformedTextFieldState.getClass();
        throw null;
    }

    @Override // com.braintreepayments.api.AuthorizationCallback
    public void b(final Authorization authorization, BraintreeException braintreeException) {
        final BraintreeClient this$0 = (BraintreeClient) this.f1176a;
        final HttpResponseCallback httpResponseCallback = (HttpResponseCallback) this.b;
        final String url = (String) this.c;
        final String str = (String) this.d;
        final Map map = (Map) this.e;
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(url, "$url");
        if (authorization != null) {
            this$0.c(new ConfigurationCallback() { // from class: com.braintreepayments.api.d
                @Override // com.braintreepayments.api.ConfigurationCallback
                public final void a(Configuration configuration, Exception exc) {
                    BraintreeClient this$02 = this$0;
                    Intrinsics.h(this$02, "this$0");
                    String url2 = url;
                    Intrinsics.h(url2, "$url");
                    HttpResponseCallback httpResponseCallback2 = httpResponseCallback;
                    if (configuration == null) {
                        httpResponseCallback2.a(exc, null);
                        return;
                    }
                    this$02.f.b(url2, str, configuration, authorization, map, new a(this$02, url2, httpResponseCallback2));
                }
            });
        } else {
            httpResponseCallback.a(braintreeException, null);
        }
    }

    public /* synthetic */ a(BraintreeClient braintreeClient, HttpResponseCallback httpResponseCallback, String str, String str2, Map map) {
        this.f1176a = braintreeClient;
        this.b = httpResponseCallback;
        this.c = str;
        this.d = str2;
        this.e = map;
    }
}
