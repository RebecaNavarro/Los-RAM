package com.example.losram.fragment

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.losram.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapaRehechoFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val sydney = LatLng(-16.541410, -68.077619)

        googleMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

//       val lapaz = LatLng(-16.541410, -68.077619)
//        googleMap.addMarker(MarkerOptions().position(lapaz).title("San Miguel La Paz"))
//1
//        val bigSur = LatLng(-16.540395, -68.077636)
//        googleMap.addMarker(MarkerOptions().position(bigSur).title("Big Sur San Miguel"))
////2
//        val hering = LatLng(-16.543373, -68.077334)
//        googleMap.addMarker(MarkerOptions().position(hering).title("Hering San Miguel"))
////3
//        val clementine = LatLng(-16.540060, -68.079662)
//        googleMap.addMarker(MarkerOptions().position(clementine).title("Clementine San Miguel"))
////4
//        val somos = LatLng(-16.536610, -68.075652)
//        googleMap.addMarker(MarkerOptions().position(somos).title("Somos Calacoto"))
////5
//        val mango = LatLng(-16.541472, -68.079472)
//        googleMap.addMarker(MarkerOptions().position(mango).title("Mango San Miguel"))
////6
//        val benetton = LatLng(-16.541324, -68.080728)
//        googleMap.addMarker(MarkerOptions().position(benetton).title("Benetton San Miguel"))
////7
//        val faceBoutique = LatLng(-16.541000, -68.078528)
//        googleMap.addMarker(MarkerOptions().position(faceBoutique).title("FaceBoutique San Miguel"))
////8
//        val vickys = LatLng(-16.544653, -68.077783)
//        googleMap.addMarker(MarkerOptions().position(vickys).title("Vickys Casual San Miguel"))
////9
//        val yuth = LatLng(-16.539611, -68.077806)
//        googleMap.addMarker(MarkerOptions().position(yuth).title("Yuth San Miguel"))
////10
//        val fairplay = LatLng(-16.545417, -68.078750)
//        googleMap.addMarker(MarkerOptions().position(fairplay).title("FairPlay San Miguel"))
////11
//        val eye = LatLng(-16.542330, -68.077246)
//        googleMap.addMarker(MarkerOptions().position(eye).title("E&E San Miguel"))
////12
//        val womansecret = LatLng(-16.542330, -68.077246)
//        googleMap.addMarker(MarkerOptions().position(womansecret).title("WomanSecret San Miguel"))
////13
//        val solmania = LatLng(-16.542539, -68.080952)
//        googleMap.addMarker(MarkerOptions().position(solmania).title("Solmania San Miguel"))
////14
//        val lupo = LatLng(-16.543278, -68.077222)
//        googleMap.addMarker(MarkerOptions().position(lupo).title("LUPO San Miguel"))
////15
//        val textilon = LatLng(-16.541722, -68.077500)
//        googleMap.addMarker(MarkerOptions().position(textilon).title("Textilon San Miguel"))
////16
//        val surmoda = LatLng(-16.540265, -68.078691)
//        googleMap.addMarker(MarkerOptions().position(surmoda).title("Sur Moda San Miguel"))
//////17
//        val adidas = LatLng(-16.540211, -68.078346)
//        googleMap.addMarker(MarkerOptions().position(adidas).title("Adidas San Miguel"))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mapa_rehecho, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.mapa) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}