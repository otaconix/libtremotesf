TARGET = tremotesf
TEMPLATE = lib

QMAKE_CXXFLAGS += -Wall -Wextra -pedantic
DEFINES += QT_DEPRECATED_WARNINGS QT_DISABLE_DEPRECATED_BEFORE=0x050800

QT = core network concurrent

HEADERS = rpc.h serversettings.h serverstats.h torrent.h tracker.h
SOURCES = rpc.cpp serversettings.cpp serverstats.cpp torrent.cpp tracker.cpp

android {
    CONFIG += c++1z
    INCLUDEPATH += $$(ANDROID_NDK_ROOT)/sysroot/usr/include
    HEADERS += jni/jnirpc.h
    SOURCES += jni/jnirpc.cpp jni/libtremotesf_wrap.cxx
} else {
    CONFIG += c++11 static
    sailfishos {
        QT += qml
        DEFINES += TREMOTESF_SAILFISHOS
    }
}
