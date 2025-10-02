package au.com.woolworths.shop.lists.ui.snapalist.main;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import au.com.woolworths.android.onesite.utils.Locales;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/CameraCaptureManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CameraCaptureManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12455a;
    public Uri b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/CameraCaptureManager$Companion;", "", "", "FILE_NAME_FORMAT", "Ljava/lang/String;", "FILE_EXTENSION", "IMAGE_DIRECTORY", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Inject
    public CameraCaptureManager(@ApplicationContext @NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f12455a = context;
    }

    public final boolean a(ActivityResultLauncher launcher) {
        Intrinsics.h(launcher, "launcher");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Context context = this.f12455a;
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.j), YU.a.i("No camera app found on device :", Build.MANUFACTURER, " ", Build.MODEL), null, 12);
            return false;
        }
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "images");
        file.mkdirs();
        Uri uriD = FileProvider.d(context, context.getPackageName() + ".fileprovider", new File(file, YU.a.g(new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS", Locales.a()).format(Long.valueOf(System.currentTimeMillis())), ".jpg")));
        this.b = uriD;
        if (uriD != null) {
            launcher.a(uriD, null);
            return true;
        }
        Bark.Companion companion2 = Bark.f8483a;
        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.j), "Snap a list capture photo failed", "Image file name is null", 8);
        return false;
    }
}
