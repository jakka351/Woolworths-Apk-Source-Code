package au.com.woolworths.feature.shared.web.file.uploader.permission;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionContract;", "", "ViewState", "Action", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CameraPermissionContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionContract$Action;", "", "RequestCameraPermission", "Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionContract$Action$RequestCameraPermission;", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionContract$Action$RequestCameraPermission;", "Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionContract$Action;", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RequestCameraPermission extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final RequestCameraPermission f6563a = new RequestCameraPermission();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestCameraPermission);
            }

            public final int hashCode() {
                return -216744832;
            }

            public final String toString() {
                return "RequestCameraPermission";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionContract$ViewState;", "", "Companion", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState b = new ViewState(false);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6564a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/web/file/uploader/permission/CameraPermissionContract$ViewState$Companion;", "", "web-file-uploader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z) {
            this.f6564a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f6564a == ((ViewState) obj).f6564a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6564a);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("ViewState(showSettingsDialog=", ")", this.f6564a);
        }
    }
}
