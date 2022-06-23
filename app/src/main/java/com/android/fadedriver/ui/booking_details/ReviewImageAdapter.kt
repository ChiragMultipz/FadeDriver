package com.android.fadedriver.ui.booking_details

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.android.fadedriver.R
import com.android.fadedriver.databinding.ItemImageBinding
import com.android.fadedriver.extension.loadingImage
import com.android.fadedriver.utils.Constants
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class ReviewImageAdapter(private val context: Context, private val arrayListImage: ArrayList<ImageItem?>) : RecyclerView.Adapter<ReviewImageAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ItemImageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        loadingImage(context, Constants.STORAGE_URL.plus(arrayListImage[position]!!.image!!), holder.binding.ivImage, false)

        holder.binding.cardItem.setOnClickListener {
            openImageBottomSheet(Constants.STORAGE_URL.plus(arrayListImage[position]!!.image!!), context)
        }
    }

    private fun openImageBottomSheet(filename: String, context: Context) {
        val dialog = BottomSheetDialog(context)
        dialog.setContentView(R.layout.custom_image_dialog)
        val bottomSheet = dialog.findViewById<View>(R.id.design_bottom_sheet)
        BottomSheetBehavior.from(bottomSheet!!).state = BottomSheetBehavior.STATE_EXPANDED
        val ivImage = dialog.findViewById<ImageView>(R.id.ivImage)
        val ivClose = dialog.findViewById<ImageView>(R.id.ivClose)
        loadingImage(context, filename, ivImage!!, false)

        ivClose!!.setOnClickListener{
            dialog.dismiss()
        }

        dialog.show()
    }

    override fun getItemCount(): Int = arrayListImage.size

    fun getImageList(): ArrayList<ImageItem?>{
        return  arrayListImage
    }
    fun updateList(images: ArrayList<ImageItem?>?) {
        arrayListImage.clear()
        arrayListImage.addAll(images!!)
        notifyDataSetChanged()
    }
}

