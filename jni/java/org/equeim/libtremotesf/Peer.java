/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.equeim.libtremotesf;

public class Peer {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Peer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Peer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtremotesfJNI.delete_Peer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAddress(String value) {
    libtremotesfJNI.Peer_address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return libtremotesfJNI.Peer_address_get(swigCPtr, this);
}

  public void setDownloadSpeed(long value) {
    libtremotesfJNI.Peer_downloadSpeed_set(swigCPtr, this, value);
  }

  public long getDownloadSpeed() {
    return libtremotesfJNI.Peer_downloadSpeed_get(swigCPtr, this);
  }

  public void setUploadSpeed(long value) {
    libtremotesfJNI.Peer_uploadSpeed_set(swigCPtr, this, value);
  }

  public long getUploadSpeed() {
    return libtremotesfJNI.Peer_uploadSpeed_get(swigCPtr, this);
  }

  public void setProgress(float value) {
    libtremotesfJNI.Peer_progress_set(swigCPtr, this, value);
  }

  public float getProgress() {
    return libtremotesfJNI.Peer_progress_get(swigCPtr, this);
  }

  public void setFlags(String value) {
    libtremotesfJNI.Peer_flags_set(swigCPtr, this, value);
  }

  public String getFlags() {
    return libtremotesfJNI.Peer_flags_get(swigCPtr, this);
}

  public void setClient(String value) {
    libtremotesfJNI.Peer_client_set(swigCPtr, this, value);
  }

  public String getClient() {
    return libtremotesfJNI.Peer_client_get(swigCPtr, this);
}

}
