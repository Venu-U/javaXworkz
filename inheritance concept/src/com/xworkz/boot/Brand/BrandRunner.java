package com.xworkz.boot.Brand;

import com.xworkz.app.Brand.Brand;
import com.xworkz.app.Brand.BrandUtil;
import com.xworkz.app.Brand.DuplicateBrand;
import com.xworkz.app.Brand.InternationalBrand;
import com.xworkz.app.Brand.LocalBrand;
import com.xworkz.app.Brand.NationalBrand;

public class BrandRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in BrandRunner");
		System.out.println("----------------------");

		Brand brand=new Brand();

		LocalBrand localBrand=new LocalBrand();

		NationalBrand nationalBrand=new NationalBrand();

		DuplicateBrand duplicateBrand=new DuplicateBrand();

		InternationalBrand internationalBrand=new InternationalBrand();
		BrandUtil.brandName(brand);

		System.out.println("----------------------");
		BrandUtil.brandName(localBrand);

		System.out.println("----------------------");
		BrandUtil.brandName(nationalBrand);

		System.out.println("----------------------");
		BrandUtil.brandName(duplicateBrand);

		System.out.println("----------------------");
		BrandUtil.brandName(internationalBrand);



	}

}