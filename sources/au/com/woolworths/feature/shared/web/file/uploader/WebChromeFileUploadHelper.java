package au.com.woolworths.feature.shared.web.file.uploader;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.web.file.uploader.databinding.DialogUploadPickerBinding;
import com.dynatrace.android.callback.Callback;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/WebChromeFileUploadHelper;", "", "Companion", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebChromeFileUploadHelper {

    /* renamed from: a, reason: collision with root package name */
    public ValueCallback f6561a = null;
    public Uri b = null;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/WebChromeFileUploadHelper$Companion;", "", "", "MIME_TYPE_IMAGE", "Ljava/lang/String;", "MIME_TYPE_PDF", "TEMP_FILE_TIME_FORMAT", "TEMP_FILE_SUFFIX", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public static Intent a(WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        if (fileChooserParams != null && fileChooserParams.getAcceptTypes() != null) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            Intrinsics.g(acceptTypes, "getAcceptTypes(...)");
            intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) ArraysKt.b0(new String[]{"application/pdf", "image/*"}, acceptTypes));
        }
        return intent;
    }

    public static final void c(Function1 function1, WebChromeFileUploadHelper webChromeFileUploadHelper, Activity activity, Ref.ObjectRef objectRef) throws IOException {
        File fileCreateTempFile;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            fileCreateTempFile = File.createTempFile(YU.a.h("IMG_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()), "_"), ".jpg", activity.getCacheDir());
            fileCreateTempFile.getAbsolutePath();
        } catch (IOException unused) {
            fileCreateTempFile = null;
        }
        if (fileCreateTempFile != null) {
            Uri uriD = FileProvider.d(activity, activity.getApplication().getPackageName() + ".fileprovider", fileCreateTempFile);
            webChromeFileUploadHelper.b = uriD;
            intent.putExtra("output", uriD);
        } else {
            webChromeFileUploadHelper.d();
        }
        if (!intent.hasExtra("output")) {
            intent = null;
        }
        function1.invoke(intent);
        AlertDialog alertDialog = (AlertDialog) objectRef.d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public final void b(final Activity activity, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, Function1 function1, final Function1 function12) {
        this.f6561a = valueCallback;
        this.b = null;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            function1.invoke(a(fileChooserParams));
            return;
        }
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        int i = DialogUploadPickerBinding.A;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        DialogUploadPickerBinding dialogUploadPickerBinding = (DialogUploadPickerBinding) ViewDataBinding.q(layoutInflater, com.woolworths.R.layout.dialog_upload_picker, null, false, null);
        Intrinsics.g(dialogUploadPickerBinding, "inflate(...)");
        dialogUploadPickerBinding.z.setOnClickListener(new a(function1, this, fileChooserParams, objectRef));
        dialogUploadPickerBinding.y.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.feature.shared.web.file.uploader.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function1 function13 = function12;
                WebChromeFileUploadHelper webChromeFileUploadHelper = this;
                Activity activity2 = activity;
                Ref.ObjectRef objectRef2 = objectRef;
                Callback.g(view);
                try {
                    WebChromeFileUploadHelper.c(function13, webChromeFileUploadHelper, activity2, objectRef2);
                } finally {
                    Callback.h();
                }
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(dialogUploadPickerBinding.h);
        builder.setCancelable(false);
        builder.setNegativeButton(com.woolworths.R.string.picker_cancel, new au.com.woolworths.base.wallet.digipay.framesview.a(this, 5));
        AlertDialog alertDialogCreate = builder.create();
        objectRef.d = alertDialogCreate;
        alertDialogCreate.show();
    }

    public final void d() {
        ValueCallback valueCallback = this.f6561a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.f6561a = null;
    }
}
