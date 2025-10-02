package coil3.decode;

import android.content.res.AssetFileDescriptor;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConfigContainer configContainerA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        switch (this.d) {
            case 0:
                return (AssetFileDescriptor) this.e;
            case 1:
                return ((RemoteConfigComponent) this.e).c("firebase");
            default:
                ConfigStorageClient configStorageClient = (ConfigStorageClient) this.e;
                synchronized (configStorageClient) {
                    configContainerA = null;
                    try {
                        fileInputStreamOpenFileInput = configStorageClient.f15773a.openFileInput(configStorageClient.b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th2) {
                        fileInputStreamOpenFileInput = null;
                        th = th2;
                    }
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        configContainerA = ConfigContainer.a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStreamOpenFileInput.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        return configContainerA;
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        throw th;
                    }
                }
                return configContainerA;
        }
    }
}
